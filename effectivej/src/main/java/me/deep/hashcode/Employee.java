package me.deep.hashcode;

/**
 * An interface providing various operation that can be performed on the employee class.<br>
 * We will look how to implement the hash code method correctly.
 * <p>
 * First and foremost important point is:<br>
 * <b>Always override hash code when overriding equals.</b><br>
 * <p>
 * We will first start by looking into the general contract of overriding hash code.
 * <p>
 * 1. Consistency: Whenever this method is invoked on same object more than once during the execution of the
 * application, the hash code must consistently return the same integer. This doesn't need to be consistent from
 * one execution to another of the application.<br><br>
 * 2. If two objects are equal according to the equals(Object) method, then calling the hash code method on each
 * of the two objects must produce the same integer.<br><br>
 * 3. It is not required that if two objects are unequal according to the equals method, then calling the hash code
 * must produce distinct integer.
 * </p>
 *
 * @author Gagandeep Singh
 */
public interface Employee {

    String getID();

    String getOrganization();

    String getEmailID();
}
