package me.deep;

/**
 * Simple employee implementation. Again nothing fancy.
 *
 * @author Gagandeep Singh
 */
public class EmployeeImpl extends AbstractEmployee {

    private String employeeID;
    private String emailID;

    public EmployeeImpl(String employeeID, String emailID) {
        this.employeeID = employeeID;
        this.emailID = emailID;
    }

    public String getID() {
        return employeeID;
    }

    public String getEmailID() {
        return emailID;
    }

    @Override
    public String toString() {
        return "EmployeeImpl[employeeID: " + employeeID + ", emailID: " + emailID + "]";
    }
}
