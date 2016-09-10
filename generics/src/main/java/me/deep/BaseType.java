package me.deep;

/**
 * Generics introduced in Java 5.
 *
 * @author Gagandeep Singh
 * @purpose Main objective of generics are to provide type safety & to resolve type casting problems.
 */
public class BaseType {
    public static void main(String[] args) {

        _01_ArraysAreTypeSafe safe = new _01_ArraysAreTypeSafe();
        safe.execute();

        _02_PolymorphismOnlyForBaseType base = new _02_PolymorphismOnlyForBaseType();
        base.execute();

        _03_BoundedType bound = new _03_BoundedType();
        bound.execute();
    }
}
