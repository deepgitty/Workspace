package me.deep.comparable;

import org.junit.Assert;
import org.junit.Test;

/**
 * Let us test if overridden meets the compareTo contract.
 * <pre>
 *      The implementor must insure the following:
 *      1. sgn(x.compareTo(y)) == -sgn(y.compareTo(x));
 *      2. x.compareTo(y) > 0 & y.compareTo(z) > 0 then x.compareTo(z) > 0
 *      3. x.compareTo(y) = 0 then sgn(x.compareTo(y)) == sgn(y.compareTo(x))
 * </pre>
 *
 * @author Gagandeep Singh
 */
public class ComparableTest {

    @Test
    public void testReflexiveForSign() throws Exception {

        // x.compareTo(y) == -(y.compareTo(x))

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        EmployeeImpl emp2 = new EmployeeImpl("7993390", "ramandeep.singh@rbs.com");

        Assert.assertTrue("Comparable implementation is incorrect", emp1.compareTo(emp2) == -(emp2.compareTo(emp1)));
        Assert.assertTrue("Comparable implementation is incorrect", emp2.compareTo(emp1) == -(emp1.compareTo(emp2)));
    }

    @Test
    public void testTransitive() throws Exception {

        // x.compareTo(y) > 0 & y.compareTo(z) > 0 then x.compareTo(z) > 0

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        EmployeeImpl emp2 = new EmployeeImpl("7993390", "ramandeep.singh@rbs.com");
        EmployeeImpl emp3 = new EmployeeImpl("7993391", "aakanksha.dave@rbs.com");

        Assert.assertTrue("Comparable implementation is incorrect", emp3.compareTo(emp2) == 1);
        Assert.assertTrue("Comparable implementation is incorrect", emp2.compareTo(emp1) == 1);
        Assert.assertTrue("Comparable implementation is incorrect", emp3.compareTo(emp1) == 1);
    }

    @Test
    public void testReflexiveForEqual() throws Exception {

        // x.compareTo(y) = 0 then x.compareTo(y)) == y.compareTo(x)

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        EmployeeImpl emp2 = new EmployeeImpl("7993389", "ramandeep.singh@rbs.com");

        Assert.assertTrue("Comparable implementation is incorrect", emp1.compareTo(emp2) == 0);
        Assert.assertTrue("Comparable implementation is incorrect", emp1.compareTo(emp2) == emp2.compareTo(emp1));
    }
}