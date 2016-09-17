package me.deep.tree;

/**
 * An attempt to create a binary search tree. First let's prepare this class for string instance.
 * TODO: Try to make it generic.
 *
 * @author Gagandeep Singh
 */
public class BinarySearchTree implements BinaryTree {

    private Node<Comparable> start;
    private int size = 0;

    public BinarySearchTree() {
        this.start = new Node<Comparable>(null, null, null, null);
    }

    public int size() {
        return size;
    }

    public boolean insert(Comparable value) {

        Node<Comparable> current;
        if (value == null) {
            throw new NullPointerException("Null value not allowed for binary search tree");
        }
        if (isEmpty()) {
            start.rightChild = new Node<Comparable>(null, null, null, value);
            ++size;
        } else {
            current = start.rightChild;
            while (true) {
                if (current.value.compareTo(value) > 0) {
                    if (current.leftChild == null) {
                        current.leftChild = new Node<Comparable>(null, null, current, value);
                        ++size;
                        break;
                    }
                    current = current.leftChild;
                } else {
                    if (current.rightChild == null) {
                        current.rightChild = new Node<Comparable>(null, null, current, value);
                        ++size;
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return (size() < 1);
    }

    private static class Node<T> {

        private Node<T> leftChild;
        private Node<T> rightChild;
        private Node<T> parent;
        private T value;

        public Node(Node<T> leftChild, Node<T> rightChild, Node<T> parent, T value) {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.parent = parent;
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public Comparable[] toArray() {
        return null;
    }

    public Comparable clone() {

        return null;
    }

    public void traverse(int i) {
        if (i == 1) traverse(start.rightChild);
        //else traversePre(start.rightChild);
        System.out.println();
    }

    /**
     * In-order traversal will sort the elements inside the binary search tree.
     */
    private void traverse(Node<Comparable> current) {

        if (current == null) return;
        traverse(current.leftChild);
        System.out.print(current + " ");
        traverse(current.rightChild);
    }

    public BinarySearchTree cloneTree() {

        BinarySearchTree tree = new BinarySearchTree();
        cloneTree(this.start.rightChild, tree);
        return tree;
    }

    private void cloneTree(Node<Comparable> from, BinarySearchTree to) {

        if (from == null) return;
        to.insert(from.value);
        cloneTree(from.leftChild, to);
        cloneTree(from.rightChild, to);
    }

    public void isLeaf(Comparable value) {

        Node<Comparable> current = start.rightChild;
        while (current.value != value) {

        }
        /*
        if (from != null) {
            isLeaf(from.leftChild, to);
            isLeaf(from.rightChild, to);
            to.insert(from.value);
        }
        */
        return;
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Integer(50));
        tree.insert(new Integer(30));
        tree.insert(new Integer(70));
        tree.insert(new Integer(20));
        tree.insert(new Integer(40));
        tree.insert(new Integer(60));
        tree.insert(new Integer(32));
        tree.insert(new Integer(65));
        tree.insert(new Integer(80));
        tree.insert(new Integer(34));
        tree.insert(new Integer(75));
        tree.insert(new Integer(85));
        tree.insert(new Integer(36));

        System.out.println("In-order");
        tree.traverse(1);
        System.out.println("Pre-order");
        tree.traverse(2);

        System.out.println("Tree 2");
        BinarySearchTree tree2 = tree.cloneTree();
        tree2.traverse(1);
    }
}
