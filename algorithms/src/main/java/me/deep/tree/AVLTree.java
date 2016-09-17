package me.deep.tree;

/**
 * Georgy Adelson-Velsky and Evgenii Lendis Tree. AVL implemetation of the binary search tree.
 * <p>
 * AVL is a self balancing tree. In an AVL tree the height of the 2 child subtrees of any node
 * differ by at-most one, if any time they differ by at-most one, re-balancing is done to restore
 * the property.
 *
 * @author Gagandeep Singh
 */
public class AVLTree<E extends Comparable<E>> implements BinaryTree {

    private Node<E> parentNode = new Node<E>(null, null, null);
    private int size = 0;

    public void insert(E element) {

        parentNode = insert(element, parentNode.right);
    }

    private Node<E> insert(E element, Node<E> current) {
        if (current == null) {
            return new Node<E>(null, element, null);
        } else if (element.compareTo(current.value) < 0) {
            // Less than the root element so left align.
            current.left = insert(element, current.left);
            if (height(current.left) - height(current.right) == 2)
                if (element.compareTo(current.left.value) < 0)
                    current = leftRotation(current);
                else
                    current = leftRightRotation(current);
        } else if (element.compareTo(current.value) > 0) {
            // Bigger than the root element so right align.
            current.right = insert(element, current.right);
            if (height(current.right) - height(current.left) == 2)
                if (element.compareTo(current.right.value) > 0)
                    current = rightRotation(current);
                else
                    current = rightLeftRotation(current);
        }
        current.height = max(height(current.left), height(current.right)) + 1;
        return current;
    }

    private int max(int left, int right) {
        return left > right ? left : right;
    }

    public int height(Node<E> node) {
        return node.height;
    }

    private boolean balanced() {
        return false;
    }

    private Node<E> leftRotation(Node<E> current) {

        Node<E> temp = current.left;
        current.left = temp.right;
        temp.right = temp;
        return current;
    }

    private Node<E> rightRotation(Node<E> current) {

        Node<E> temp = current.right;
        current.right = temp.left;
        temp.left = temp;
        return current;
    }

    private Node<E> leftRightRotation(Node<E> current) {

        current.left = leftRotation(current.left);
        return rightRotation(current);
    }

    private Node<E> rightLeftRotation(Node<E> current) {

        current.right = leftRotation(current.right);
        return rightRotation(current);
    }

    private static class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;
        int height;

        Node(Node<T> left, T value, Node<T> right) {

            this.left = left;
            this.value = value;
            this.right = right;
            height = 0;
        }
    }

    private void traverse(Node<E> node) {

        if (node != null) {
            traverse(node.left);
            System.out.print(node.value);
            traverse(node.right);
        }
    }

    private void inOrder() {
        traverse(parentNode.right);
    }

    public static void main(String[] args) {

        AVLTree<String> avl = new AVLTree<String>();
        avl.insert("A");
        avl.insert("B");
        avl.insert("C");
        avl.insert("D");
        avl.insert("E");
        avl.insert("F");
        avl.insert("G");


        avl.inOrder();
    }
}
