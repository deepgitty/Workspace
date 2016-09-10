package me.deep;

import java.util.Collection;

/**
 * Bounded types: We can bound the type parameters for a particular range by using extends keyword.
 * <p>
 * Syntax:
 * T extends X: X can either be class or interface.
 * 1. X is class: We can pass either X or its child classes
 * 2. X is interface: We can pass wither X or its implementation classes.
 * <p>
 * We can define bounded type in combinations too.
 * 1. T extends SomeClass:                              Valid
 * 2. T extends SomeClass & Interface1:                 Valid
 * 3. T extends SomeClass & Interface1 & Interface2:    Valid
 * 4. T extends Interface1 & SomeClass:                 Invalid, Reason: Class must be before any interface
 * 5. T extends SomeClass & OtherClass:                 Invalid, Reason: Can only extend single class
 *
 * @author Gagandeep Singh
 */
public class _03_BoundedType<T extends Number & Runnable & Collection<String>> {

    public void execute() {

    }
}
