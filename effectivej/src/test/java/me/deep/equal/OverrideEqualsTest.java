package me.deep.equal;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Let us test if overridden meets the equals contract.
 * <p>
 * We know the contract of equals, so our test cases will be based on this:
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
 * <p>
 * 5. <i>Consistent: </i>For any non-null value x and y, multiple invocations of x.equals(y) must consistently return
 * false or true, provided no information is changed.<br>
 *
 * @author Gagandeep Singh
 */
public class OverrideEqualsTest {

    @Test
    public void testReflexive() throws Exception {

        // Reflexive means for any non null value x, x.equals(x) returns true.

        EmployeeImpl emp = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        Assert.assertEquals("Equals method is not reflexive", true, emp.equals(emp));
    }

    @Test
    public void testSymmetric() throws Exception {

        // Symmetric means for any non-null value x and y, x.equals(y) must return true if and only if y.equals(x)
        // returns true.

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        EmployeeImpl emp2 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        Assert.assertEquals("Equals method is not reflexive", emp1.equals(emp2), emp2.equals(emp1));
    }

    @Test
    public void testTransitive() throws Exception {

        // Transitive means for any non-null value x, y, z, if x.equals(y) returns true and y.equals(z) returns true,
        // then x.equals(z) must return true.

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        EmployeeImpl emp2 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        EmployeeImpl emp3 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        Assert.assertEquals("Equals method is not reflexive", emp1.equals(emp2) && emp2.equals(emp3),
                emp1.equals(emp3));
    }

    @Test
    public void testNullReference() throws Exception {

        // Null Reference means for any non-null value x, x.equals(null) must return false.

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        Assert.assertEquals("Equals method is not reflexive", false, emp1.equals(null));
    }

    @Test
    public void testConsistency() throws Exception {

        // Consistent means for any non-null value x and y, multiple invocations of x.equals(y) must consistently
        // return false or true, provided no information is changed.

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Assert.assertEquals("Equals method is not reflexive", false, emp1.equals(null));
            Assert.assertEquals("Equals method is not reflexive", true, emp1.equals(emp1));
        }
    }
}
