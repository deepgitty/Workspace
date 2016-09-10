package me.deep;

/**
 * What if you only want a particular method to be generic and not the whole class.
 * We can declare a method generic type by putting the generic signature before the return type of a method
 * Example:
 * public <T> void method(T type);
 * <p>
 * Generic methods can also be bounded type:
 * 1. public <T> void method(T type);
 * 2. public <T extends SomeClass> void method(T type);
 * 3. public <T extends Interface1 & Interface2> void method(T type);
 * 4. public <T extends SomeClass & Interface1> void method(T type);
 * 5. public <T extends SomeClass & Interface1 & Interface2> void method(T type);
 *
 * @author Gagandeep Singh
 */
public class _05_GenericMethods {

    public <T> void execute(T type) {

    }
}
