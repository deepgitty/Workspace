package me.deep;

/**
 * An interface providing various operation that can be performed on the employee class.
 *
 * @author Gagandeep Singh
 */
public interface Employee extends Comparable<Employee> {

    String getID();

    String getOrganization();

    String getEmailID();
}