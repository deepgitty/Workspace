package me.deep.hashcode;

/**
 * Abstract class for the employee's that belong to RBS Bank.
 * Putting all together here is the recipe for high quality hash code method.
 * <pre>
 * 1. Store some constant non zero value (say 17) in an int variable (say result).
 * 2. For each significant field in you class do the following
 *      a. Compute an int hash code for the field
 *          i.   If field is boolean, compute (value ? 1 : 0)
 *          ii.  If field is byte, char, short or int, compute ((int) value)
 *          iii. If field is long, compute ((int) (value ^ (value >>> 32)))
 *          iv.  If the field is a float, compute Float.floatToIntBits(value).
 *          v.   If the field is a double, compute Double.doubleToLongBits(f), and then hash the resulting long as in
 *               step 2.a.iii.
 *          vi.  If the field is an object reference and this class’s equals method compares the field by recursively
 *               invoking equals, recursively invoke hashCode on the field. If a more complex comparison is required,
 *               compute a “canonical representation” for this field and invoke hashCode on the canonical
 *               representation. If the value of the field is null, return 0 (or some other constant, but 0 is
 *               traditional).
 *          vii. If the field is an array, treat it as if each element were a separate field. That is, compute a hash
 *               code for each significant element by applying these rules recursively, and combine these values per
 *               step 2.b.
 *      b. Combine the hash code c computed in step 2.a into result as follows:
 *              result = 31 * result + c
 * 3. Return result;
 * 4. You must exclude any fields that are not used in equals comparisons, or you risk violating the second provision
 * of the hashCode contract.
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
    
    @Override
    public int hashCode() {

        int hashCode = 17;
        hashCode = 31 * hashCode + employeeID.hashCode();
        hashCode = 31 * hashCode + emailID.hashCode();
        hashCode = 31 * hashCode + org.hashCode();
        return hashCode;
    }
}
