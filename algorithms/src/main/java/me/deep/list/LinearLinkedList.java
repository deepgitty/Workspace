package me.deep.list;

/**
 * Generic linear linked list implementation. Also known as:
 * 1. Singly linked list.
 * 2. One way list
 *
 * @author Gagandeep Singh
 */
public class LinearLinkedList<T> {

    private Node<T> start;
    private Node<T> last;
    private int size = 0;

    public LinearLinkedList() {
        start = new Node<T>(null, null);
        last = start;
    }

    public void add(T value) {
        last.next = new Node<T>(null, value);
        last = last.next;
        size++;
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer("");
        Node<T> pos = start;
        while (size > 0 && pos.next != null) {
            buffer.append(pos.next.value);
            pos = pos.next;
            if (pos.next != null)
                buffer.append(", ");
        }
        return "[" + buffer + "]";
    }

    private static class Node<T> {

        private Node<T> next;
        private T value;

        public Node(Node<T> next, T value) {
            this.next = next;
            this.value = value;
        }
    }
}
