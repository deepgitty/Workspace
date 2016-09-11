package me.deep.comparable;

/**
 * Abstract class for the employee's that belong to RBS Bank.
 *
 * @author Gagandeep Singh
 */
public abstract class AbstractEmployee implements Employee {

    private static final int SMALLER = -1;
    private static final int EQUAL = 0;
    private static final int BIGGER = 1;

    protected String employeeID;
    protected String emailID;
    protected String org;

    public AbstractEmployee() {
        org = "Royal Bank of Scotland";
    }

    public String getOrganization() {
        return org;
    }

    public int compareTo(Employee o) {

        if (o == null) {
            throw new ClassCastException("Null employee reference passed.");
        }

        long thisCode = Long.parseLong(getID());
        long thatCode = Long.parseLong(o.getID());

        if (thisCode < thatCode) return SMALLER;
        else if (thisCode == thatCode) return EQUAL;
        return BIGGER;
    }
}