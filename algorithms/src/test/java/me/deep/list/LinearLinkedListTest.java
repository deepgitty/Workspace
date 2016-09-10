package me.deep.list;

import junit.framework.Assert;
import me.deep.Employee;
import me.deep.EmployeeImpl;
import org.junit.Test;

/**
 * Lets test out linear linked list.
 *
 * @author Gagandeep Singh
 */
public class LinearLinkedListTest {

    @Test
    public void testEmptyTraversal() throws Exception {

        LinearLinkedList<String> list = new LinearLinkedList<String>();
        Assert.assertEquals("Traversing linked list mismatch", "[]", list.toString());
    }

    @Test
    public void testInsertionSingle() throws Exception {

        LinearLinkedList<String> list = new LinearLinkedList<String>();
        list.add("Gagandeep Singh");
        Assert.assertEquals("Traversing linked list mismatch", "[Gagandeep Singh]", list.toString());
    }

    @Test
    public void testInsertionMultiple() throws Exception {

        LinearLinkedList<String> list = new LinearLinkedList<String>();
        list.add("Gagandeep Singh");
        list.add("Ramandeep Singh");
        list.add("Gagandeep Singh");
        list.add("Aakanksha Dave");
        Assert.assertEquals("Traversing linked list mismatch", "[Gagandeep Singh, Ramandeep Singh, Gagandeep Singh, " +
                "Aakanksha Dave]", list.toString());
    }

    @Test
    public void testGenericSingleElementString() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();
        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com]]", list.toString());
    }
}
