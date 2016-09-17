package me.deep.list;

/**
 * Generic linear linked list implementation. Also known as:
 * 1. Singly linked list.
 * 2. One way list
 *
 * @author Gagandeep Singh
 */
public class LinearLinkedList<T> extends AbstractList<T> {

    private Node<T> header;
    private Node<T> tail;

    public LinearLinkedList() {
        header = new Node<T>(null, null);
        tail = header;
    }

    public boolean add(T value) {
        tail.next = new Node<T>(null, value);
        tail = tail.next;
        size++;
        return true;
    }

    public boolean add(List<T> list) {
        T[] listArray = (T[]) list.toArray();
        for (T type : listArray) {
            add(type);
        }
        return true;
    }

    public boolean remove(T value) {
        boolean removed = false;
        if (contains(value)) {
            Node<T> effectiveNode = header;
            while (effectiveNode.next != null) {
                if (effectiveNode.next.value.equals(value)) {
                    effectiveNode.next = effectiveNode.next.next;
                    removed = true;
                    // Making sure that in case tail element is deleted, tail still points to correct position
                    if (effectiveNode.next == null) {
                        tail = effectiveNode;
                    }
                    break;
                }
                effectiveNode = effectiveNode.next;
            }
            size--;
        }
        return removed;
    }

    public Object[] toArray() {
        int i = 0;
        Object[] array = new Object[size];
        Node<T> effectiveNode = header;
        while (effectiveNode.next != null) {
            array[i++] = effectiveNode.next.value;
            effectiveNode = effectiveNode.next;
        }
        return array;
    }

    public boolean contains(T value) {
        Node<T> effectiveNode = header;
        while (size > 0 && effectiveNode.next != null) {
            T returned = effectiveNode.next.value;
            if (returned.equals(value)) {
                return true;
            }
            effectiveNode = effectiveNode.next;
        }
        return false;
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer("");
        Node<T> pos = header;
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
