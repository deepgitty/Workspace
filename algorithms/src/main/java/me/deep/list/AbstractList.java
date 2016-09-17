package me.deep.list;

/**
 * An abstract representation of the list. Contains methods common to all the list types.
 *
 * @author Gagandeep Singh
 */
public abstract class AbstractList<T> implements List<T> {

    protected int size = 0;

    public boolean isEmpty() {
        if (size > 0)
            return false;
        return true;
    }

    public int size() {
        return size;
    }
}
