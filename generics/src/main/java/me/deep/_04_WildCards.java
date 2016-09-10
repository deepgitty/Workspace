package me.deep;

import java.util.ArrayList;

/**
 * Generics make use of the wild card using the keyword: ?
 * Currently we can do following:
 * method(ArrayList<String>): Can call this method by passing the array list of only string type.
 * <p>
 * What if we don't know about the type parameter in advance.
 * method(ArrayList<?>): Can call this method by passing the array list of any unknown type.
 * method(ArrayList<? extends Type>): Can call this method by passing the array list of either
 * 1. In case Type is a class then we can pass Type or its subclasses.
 * 2. In case Type is an interface then we can pass Type or its implemented classes.
 * <p>
 * method(ArrayList<? super Type>): Can call this method by passing the array list of either Type or its super classes.
 *
 * @author Gagandeep Singh
 */
public class _04_WildCards {

    public void execute(ArrayList<String> list) {

        execute2(list);
        ArrayList<Integer> num = new ArrayList<Integer>();
        execute2(num);

        execute3(num);
    }

    /**
     * Since we can't add anything to the method then why use wild card.
     * This sort of methods are best suitable for read only operations.
     * To solve this problem we introduced the super keyword.
     * method(ArrayList<? super Type>): Can call this method by passing the array list of either Type or its super
     * classes.
     *
     * @param list
     */
    public void execute2(ArrayList<?> list) {
        // This is invalid.
        // We can't add anything to the list except null type.
        //list.add(20); add (capture<?>) in ArrayList cannot be applied to (int).
    }

    public void execute3(ArrayList<? extends Number> num) {

    }

    /**
     * To remove the problem of read only we introduced the super keyword.
     * <p>
     * method(ArrayList<? super Type>): Can call this method by passing the array list of either
     * 1. In case Type is a class, we pass the array list of either Type or its super classes.
     * 2. In case Type is an interface, we pass the array list of either Type or super class of the implementation
     * class of Type.
     *
     * @param list
     */
    public void execute4(ArrayList<? super Integer> list) {
        Object obj = new Object();
        list.add(30);
        // list.add(obj);
    }

    /**
     * The "super" keyword.
     *
     * Consider List<? super Type>
     * The wildcard declaration of List<? super Integer> foo3 means that any of these are legal assignments:
     * 1. List<? super Integer> foo3 = new ArrayList<Integer>();  // Integer is a "superclass" of Integer.
     * 2. List<? super Integer> foo3 = new ArrayList<Number>();   // Number is a superclass of Integer
     * 3. List<? super Integer> foo3 = new ArrayList<Object>();   // Object is a superclass of Integer
     *
     * READING:
     * Given the above possible assignments, what type of object are you guaranteed to receive when you read from foo3:
     * 1. You aren't guaranteed an Integer because foo3 could be pointing at a List<Number> or List<Object>.
     * 2. You aren't guaranteed an Number because foo3 could be pointing at a List<Object>.
     * 3. The only guarantee is that you will get an instance of an Object or subclass of Object (but you don't know
     * what subclass).
     *
     * WRITING:
     * Given the above possible assignments, what type of object could you add to List foo3 that would be legal for all
     * the above possible ArrayList assignments:
     * 1. You can add an Integer because an Integer is allowed in any of above lists.
     * 2. You can add an instance of a subclass of Integer because an instance of a subclass of Integer is allowed in
     * any of the above lists.
     *
     * 3. You can't add a Double because foo3 could be pointing at a ArrayList<Integer>.
     * 4. You can't add a Number because foo3 could be pointing at a ArrayList<Integer>.
     * 5. You can't add a Object because foo3 could be pointing at a ArrayList<Integer>.
     *
     * PECS:
     *
     * Remember PECS: "Producer Extends, Consumer Super".
     *
     * "Producer Extends" - If you need a List to produce T values (you want to read Ts from the list), you need to
     * declare it with ? extends T, e.g. List<? extends Integer>. But you cannot add to this list.
     *
     * "Consumer Super" - If you need a List to consume T values (you want to write Ts into the list), you need to
     * declare it with ? super T, e.g. List<? super Integer>. But there are no guarantees what type of object you may
     * read from this list.
     *
     * If you need to both read from and write to a list, you need to declare it exactly with no wildcards, e.g. List<Integer>.
     */
}
