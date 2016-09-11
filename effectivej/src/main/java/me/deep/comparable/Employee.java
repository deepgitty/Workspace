package me.deep.comparable;

/**
 * An interface providing various operation that can be performed on the employee class.
 * We will look how to implement the compare to method of Comparable interface correctly.
 * <pre>
 *     General contract of compare to is similar to that of equals.
 *     1. Compare this object to the specified object for order. Returns
 *          a. -ive integer as this object is less than specified object
 *          b. zero as this object is equal to specified object
 *          c. +ive integer as this object is greater than specified object
 *     2. Throws {@link ClassCastException} if the specified object's type prevents it from being compared to this
 *          object.
 * </pre>
 * <pre>
 *      The implementor must insure the following:
 *      1. sgn(x.compareTo(y)) == -sgn(y.compareTo(x));
 *      2. x.compareTo(y) > 0 & y.compareTo(z) > 0 then x.compareTo(z) > 0
 *      3. x.compareTo(y) = 0 then sgn(x.compareTo(y)) == sgn(y.compareTo(x))
 * </pre>
 *
 * @author Gagandeep Singh
 */
public interface Employee extends Comparable<Employee> {

    String getID();

    String getOrganization();

    String getEmailID();
}