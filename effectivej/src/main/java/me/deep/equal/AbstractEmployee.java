package me.deep.equal;

/**
 * Abstract class for the employee's that belong to RBS Bank.
 * Putting all together here is the recipe for high quality equals method.
 * <p>
 * 1. Use the == operator to check if the argument is a reference to this object. If so return true.<br>
 * Example:
 * <pre>
 *  public boolean equals(Object o) {
 *      if(o == this) return true;
 *  }
 * </pre>
 * <p>
 * 2. Use the instanceof operator to check if the argument has the correct type. If not return false.<br>
 * Example:
 * <pre>
 * public boolean equals(Object o) {
 *      if (!(o instanceof Employee)) return false;
 * }
 * </pre>
 * <p>
 * 3. Cast the argument to the correct type.<br>
 * Example:
 * <pre>
 * public boolean equals(Object o) {
 *      Employee employee = (Employee) o;
 * }
 * </pre>
 * <p>
 * 3. For each significant field in this class, check if that field of the argument matches the corresponding field of
 * the object.<br>
 * Example:
 * <pre>
 * public boolean equals(Object o) {
 *        return employeeID.equals(employee.getID()) &&
 *                  emailID.equals(employee.getEmailID()) &&
 *                  org.equals(employee.getOrganization());
 * }
 * </pre>
 *
 * @author Gagandeep Singh
 */
public abstract class AbstractEmployee implements Employee {

    protected String employeeID;
    protected String emailID;
    protected String org;

    public AbstractEmployee() {
        org = "Royal Bank of Scotland";
    }

    public String getOrganization() {
        return org;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || !(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return employeeID.equals(employee.getID()) &&
                emailID.equals(employee.getEmailID()) &&
                org.equals(employee.getOrganization());
    }

    //TODO: This is incomplete tutorial and for convenience sake divided into two parts.
    //TODO: Remember always override hash code when you override equals.
}
