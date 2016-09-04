package me.deep.cc.sort;

/**
 * A normal employee class meant to be used by other classes for algorithm testing anf other purposes.
 *
 * @author Gagandeep Singh
 */
public class Employee {

    private int employeeID;
    private String employee;
    private float salary;
    private String managerName;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getManagerName() {

        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
