package me.deep.hashcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Let us test if overridden meets the hash code contract.
 * <pre>
 *  1. Consistency: Whenever this method is invoked on same object more than once during the execution of the
 *      application, the hash code must consistently return the same integer. This doesn't need to be consistent from
 *      one execution to another of the application.
 *  2. If two objects are equal according to the equals(Object) method, then calling the hash code method on each
 *      of the two objects must produce the same integer.
 * </pre>
 *
 * @author Gagandeep Singh
 */
public class OverrideHashCodeTest {

    @Test
    public void testConsistency() throws Exception {

        // Consistency means whenever this method is invoked on same object more than once during the execution of the
        // application, the hash code must consistently return the same integer. This doesn't need to be consistent
        // from one execution to another of the application.

        EmployeeImpl emp1 = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");

        int hashCode = emp1.hashCode();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Assert.assertEquals("Hash code method consistency problem", hashCode, emp1.hashCode());
        }
    }
}
