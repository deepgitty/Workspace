package me.deep.list;

/**
 * This interface provides all the operations performed on the list.
 * <pre>
 *     1. isEmpty: Check if the current list is empty or not.
 *     2. size: Return the size of the list.
 *     3. add: Add a new type to the list
 *     4. remove: Remove first occurrence of that type.
 *     5. toArray: An array representation of that list.
 *     6. contains: Does this list contains a particular type.
 * </pre>
 *
 * @author Gagandeep Singh
 */
public interface List<T> {

    boolean isEmpty();

    int size();

    boolean add(T value);

    boolean add(List<T> value);

    boolean remove(T value);

    Object[] toArray();

    boolean contains(T value);
}
