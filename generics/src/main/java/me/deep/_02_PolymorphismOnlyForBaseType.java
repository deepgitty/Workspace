package me.deep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * <p>
 * Generics have two parts
 * Example: ArrayList<String>. here
 * 1. ArrayList is the base type.
 * 2. String is parameter type.
 * </p>
 * <p>
 * Polymorphism is only applicable for base type and not for the parameter type.
 *
 * @author Gagandeep Singh
 */
public class _02_PolymorphismOnlyForBaseType {

    public void execute() {

        // These are valid
        Collection<Integer> collection = new HashSet<Integer>();
        List<String> list = new ArrayList<String>();

        /* This is invalid
         * ArrayList<Object> lst = new ArrayList<String>();
         */
    }
}
