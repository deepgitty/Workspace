package me.deep.tree;

/**
 * Red-Black Tree implementation of the binary search tree. This is a balanced search tree.
 *
 * @author Gagandeep Singh
 */
public class RedBlackTree<T extends Comparable<T>> {

    private static final int BLACK = 1;    // Black must be 1
    private static final int RED = 0;

    private Node<T> header = new Node<T>(null, null, null);
    private Node<T> nullNode = new Node<T>(null, null, null);

    private Node<T> current;
    private Node<T> parent;
    private Node<T> grand;
    private Node<T> great;

    private static class Node<T> {
        T element;
        Node<T> left;
        Node<T> right;
        int color;

        Node(Node<T> left, T element, Node<T> right) {
            this.element = element;
            this.left = left;
            this.right = right;
            color = BLACK;
        }
    }

    private int compare(T value, Node<T> t) {
        if (t == header)
            return 1;
        else
            return value.compareTo(t.element);
    }

    public void insert(T item) throws DuplicateItemException {
        current = parent = grand = header;
        nullNode.element = item;

        while (compare(item, current) != 0) {
            great = grand;
            grand = parent;
            parent = current;
            current = compare(item, current) < 0 ?
                    current.left : current.right;

            // Check if two red children; fix if so
            if (current.left.color == RED && current.right.color == RED)
                recolor(item);
        }

        // Insertion fails if already present
        if (current != nullNode)
            throw new DuplicateItemException(item.toString());
        current = new Node<T>(nullNode, item, nullNode);

        // Attach to parent
        if (compare(item, parent) < 0)
            parent.left = current;
        else
            parent.right = current;
        recolor(item);
    }

    private void recolor(T item) {

        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;

        if (parent.color == RED) {
            grand.color = RED;
            if ((compare(item, grand) < 0) !=
                    (compare(item, parent) < 0))
                parent = rotate(item, grand);
            current = rotate(item, great);
            current.color = BLACK;
        }
        header.right.color = BLACK;
    }

    private Node<T> rotate(T item, Node<T> parent) {
        if (compare(item, parent) < 0)
            return parent.left = compare(item, parent.left) < 0 ?
                    rotateWithLeftChild(parent.left) :
                    rotateWithRightChild(parent.left);
        else
            return parent.right = compare(item, parent.right) < 0 ?
                    rotateWithLeftChild(parent.right) :
                    rotateWithRightChild(parent.right);
    }

    private Node<T> rotateWithLeftChild(Node<T> k2) {
        Node<T> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    private Node<T> rotateWithRightChild(Node<T> k1) {
        Node<T> k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        return k2;
    }
}
