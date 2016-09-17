package me.deep.list;

import org.junit.Assert;
import me.deep.Employee;
import me.deep.EmployeeImpl;
import org.junit.Test;

/**
 * Let's test out linear linked list.
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

    @Test
    public void testContains() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();
        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993390", "ramandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993391", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));

        Assert.assertTrue("Contains working incorrectly", list.contains(new EmployeeImpl("7993392",
                "aakanksha.dave@rbs.com")));
    }

    @Test
    public void testRemove() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();
        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993390", "ramandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));
        list.add(new EmployeeImpl("7993391", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com]]", list.toString());

        Assert.assertEquals("Size is not correctly defined", 5, list.size());

        Assert.assertTrue("Removal returning wrong value", list.remove(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com")));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com]]", list.toString());

        Assert.assertEquals("Size is not correctly defined after removal", 4, list.size());
    }

    @Test
    public void testIsEmpty() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();

        Assert.assertTrue("Is empty working incorrectly", list.isEmpty());

        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993390", "ramandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));
        list.add(new EmployeeImpl("7993391", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));

        Assert.assertTrue("Is empty working incorrectly", (!list.isEmpty()));
    }

    @Test
    public void testToArray() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();

        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993390", "ramandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));
        list.add(new EmployeeImpl("7993391", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));

        Employee[] employees = new EmployeeImpl[5];
        employees[0] = new EmployeeImpl("7993389", "gagandeep.singh@rbs.com");
        employees[1] = new EmployeeImpl("7993390", "ramandeep.singh@rbs.com");
        employees[2] = new EmployeeImpl("7993392", "aakanksha.dave@rbs.com");
        employees[3] = new EmployeeImpl("7993391", "gagandeep.singh@rbs.com");
        employees[4] = new EmployeeImpl("7993392", "aakanksha.dave@rbs.com");

        Assert.assertArrayEquals("To Array not implemented correctly", employees, list.toArray());
    }

    @Test
    public void testLastPointer() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();
        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993390", "ramandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993391", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com]]", list.toString());

        Assert.assertEquals("Size is not correctly defined", 4, list.size());

        Assert.assertTrue("Removal returning wrong value", list.remove(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com")));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com]]", list.toString());

        Assert.assertEquals("Size is not correctly defined after removal", 3, list.size());

        list.add(new EmployeeImpl("7993393", "swaraj.gupta@rbs.com"));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993393, " +
                "emailID: swaraj.gupta@rbs.com]]", list.toString());

    }

    @Test
    public void testConcat() throws Exception {

        LinearLinkedList<Employee> list = new LinearLinkedList<Employee>();
        list.add(new EmployeeImpl("7993389", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993390", "ramandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993391", "gagandeep.singh@rbs.com"));
        list.add(new EmployeeImpl("7993392", "aakanksha.dave@rbs.com"));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com]]", list.toString());

        Assert.assertEquals("Size is not correctly defined", 4, list.size());

        LinearLinkedList<Employee> list2 = new LinearLinkedList<Employee>();
        list2.add(new EmployeeImpl("7993395", "amandeep.singh@rbs.com"));
        list2.add(new EmployeeImpl("7993396", "prateek.agrawal@rbs.com"));
        list2.add(new EmployeeImpl("7993397", "deepti.gupta@rbs.com"));
        list2.add(new EmployeeImpl("7993398", "deepti.gupta@rbs.com"));

        Assert.assertTrue("Removal returning wrong value", list.add(list2));
        Assert.assertEquals("Size is not correctly defined after removal", 8, list.size());
        Assert.assertTrue("Removal returning wrong value", list.remove(new EmployeeImpl("7993398", "deepti.gupta@rbs.com")));
        Assert.assertEquals("Size is not correctly defined after removal", 7, list.size());

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com], EmployeeImpl[employeeID: 7993395, " +
                "emailID: amandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993396, " +
                "emailID: prateek.agrawal@rbs.com], EmployeeImpl[employeeID: 7993397, " +
                "emailID: deepti.gupta@rbs.com]]", list.toString());

        list.add(new EmployeeImpl("7993393", "swaraj.gupta@rbs.com"));

        Assert.assertEquals("Traversing linked list mismatch", "[EmployeeImpl[employeeID: 7993389, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993390, " +
                "emailID: ramandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993391, " +
                "emailID: gagandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993392, " +
                "emailID: aakanksha.dave@rbs.com], EmployeeImpl[employeeID: 7993395, " +
                "emailID: amandeep.singh@rbs.com], EmployeeImpl[employeeID: 7993396, " +
                "emailID: prateek.agrawal@rbs.com], EmployeeImpl[employeeID: 7993397, " +
                "emailID: deepti.gupta@rbs.com], EmployeeImpl[employeeID: 7993393, " +
                "emailID: swaraj.gupta@rbs.com]]", list.toString());

    }
}
