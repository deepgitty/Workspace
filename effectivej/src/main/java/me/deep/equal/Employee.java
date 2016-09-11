package me.deep.equal;

/**
 * An interface providing various operation that can be performed on the employee class.
 * We will look how to implement the equals method correctly.
 * <p>
 * We will first start by looking into the general contract of overriding equals.
 * The equals method implements an equivalence relation
 * <p>
 * 1. <i>Reflexive: </i>For any non-null value x, x.equals(x) must return true.<br>
 * <p>
 * 2. <i>Symmetric: </i>For any non-null value x and y, x.equals(y) must return true if and only if y.equals(x) returns
 * true<br>
 * <p>
 * 3. <i>Transitive: </i>For any non-null value x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then
 * x.equals(z) must return true.<br>
 * <p>
 * 4. <i>Null Reference: </i>For any non-null value x, x.equals(null) must return false.<br>
 *
 * @author Gagandeep Singh
 */
public interface Employee {

    String getID();

    String getOrganization();

    String getEmailID();
}
