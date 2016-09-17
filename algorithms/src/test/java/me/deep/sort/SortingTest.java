package me.deep.sort;

import me.deep.Employee;
import me.deep.EmployeeImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Class containing all the test cases for sorting problems.
 *
 * @author Gagandeep Singh
 */
public class SortingTest {

    private Integer[] num = new Integer[5];
    private Integer[] numSorted = new Integer[5];
    private String[] names = new String[13];
    private String[] namesSorted = new String[13];
    private Employee[] employees = new Employee[13];
    private Employee[] employeesSorted = new Employee[13];
    private List<Employee> empList = new ArrayList<Employee>();
    private List<Employee> empListSorted = new ArrayList<Employee>();

    @Test
    public void testSortArray() throws Exception {

        QuickSort.sort(num);
        //MergeSort.sort(num);
        Assert.assertArrayEquals("Quick me.deep.sort implementation error", numSorted, num);

        QuickSort.sort(names);
        //MergeSort.sort(names);
        Assert.assertArrayEquals("Quick me.deep.sort implementation error", namesSorted, names);

        QuickSort.sort(employees);
        //MergeSort.sort(employees);
        Assert.assertArrayEquals("Quick me.deep.sort implementation error", employeesSorted, employees);
    }

    @Before
    public void populate() {

        num[0] = 4;
        num[1] = 7;
        num[2] = 1;
        num[3] = 30;
        num[4] = 5;

        numSorted[0] = 1;
        numSorted[1] = 4;
        numSorted[2] = 5;
        numSorted[3] = 7;
        numSorted[4] = 30;

        names[0] = "Paatav";
        names[1] = "Lakshak";
        names[2] = "Xilmal";
        names[3] = "Faiyaz";
        names[4] = "Gamil";
        names[5] = "Madhusha";
        names[6] = "Rafan";
        names[7] = "Bahaa";
        names[8] = "Hajira";
        names[9] = "Erin";
        names[10] = "Laavanya";
        names[11] = "Cemal";
        names[12] = "Kaanti";

        namesSorted[0] = "Bahaa";
        namesSorted[1] = "Cemal";
        namesSorted[2] = "Erin";
        namesSorted[3] = "Faiyaz";
        namesSorted[4] = "Gamil";
        namesSorted[5] = "Hajira";
        namesSorted[6] = "Kaanti";
        namesSorted[7] = "Laavanya";
        namesSorted[8] = "Lakshak";
        namesSorted[9] = "Madhusha";
        namesSorted[10] = "Paatav";
        namesSorted[11] = "Rafan";
        namesSorted[12] = "Xilmal";

        employees[0] = new EmployeeImpl("6782736", "Paatav");
        employees[1] = new EmployeeImpl("9265537", "Lakshak");
        employees[2] = new EmployeeImpl("1738934", "Xilmal");
        employees[3] = new EmployeeImpl("4567782", "Faiyaz");
        employees[4] = new EmployeeImpl("8643864", "Gamil");
        employees[5] = new EmployeeImpl("8349343", "Madhusha");
        employees[6] = new EmployeeImpl("7993389", "Rafan");
        employees[7] = new EmployeeImpl("2318234", "Bahaa");
        employees[8] = new EmployeeImpl("7393642", "Hajira");
        employees[9] = new EmployeeImpl("9728329", "Erin");
        employees[10] = new EmployeeImpl("9368243", "Laavanya");
        employees[11] = new EmployeeImpl("1236432", "Cemal");
        employees[12] = new EmployeeImpl("7263428", "Kaanti");

        employeesSorted[0] = new EmployeeImpl("1236432", "Cemal");
        employeesSorted[1] = new EmployeeImpl("1738934", "Xilmal");
        employeesSorted[2] = new EmployeeImpl("2318234", "Bahaa");
        employeesSorted[3] = new EmployeeImpl("4567782", "Faiyaz");
        employeesSorted[4] = new EmployeeImpl("6782736", "Paatav");
        employeesSorted[5] = new EmployeeImpl("7263428", "Kaanti");
        employeesSorted[6] = new EmployeeImpl("7393642", "Hajira");
        employeesSorted[7] = new EmployeeImpl("7993389", "Rafan");
        employeesSorted[8] = new EmployeeImpl("8349343", "Madhusha");
        employeesSorted[9] = new EmployeeImpl("8643864", "Gamil");
        employeesSorted[10] = new EmployeeImpl("9265537", "Lakshak");
        employeesSorted[11] = new EmployeeImpl("9368243", "Laavanya");
        employeesSorted[12] = new EmployeeImpl("9728329", "Erin");

        empList.add(new EmployeeImpl("6782736", "Paatav"));
        empList.add(new EmployeeImpl("9265537", "Lakshak"));
        empList.add(new EmployeeImpl("1738934", "Xilmal"));
        empList.add(new EmployeeImpl("4567782", "Faiyaz"));
        empList.add(new EmployeeImpl("8643864", "Gamil"));
        empList.add(new EmployeeImpl("8349343", "Madhusha"));
        empList.add(new EmployeeImpl("7993389", "Rafan"));
        empList.add(new EmployeeImpl("2318234", "Bahaa"));
        empList.add(new EmployeeImpl("7393642", "Hajira"));
        empList.add(new EmployeeImpl("9728329", "Erin"));
        empList.add(new EmployeeImpl("9368243", "Laavanya"));
        empList.add(new EmployeeImpl("1236432", "Cemal"));
        empList.add(new EmployeeImpl("7263428", "Kaanti"));

        empListSorted.add(new EmployeeImpl("1236432", "Cemal"));
        empListSorted.add(new EmployeeImpl("1738934", "Xilmal"));
        empListSorted.add(new EmployeeImpl("2318234", "Bahaa"));
        empListSorted.add(new EmployeeImpl("4567782", "Faiyaz"));
        empListSorted.add(new EmployeeImpl("6782736", "Paatav"));
        empListSorted.add(new EmployeeImpl("7263428", "Kaanti"));
        empListSorted.add(new EmployeeImpl("7393642", "Hajira"));
        empListSorted.add(new EmployeeImpl("7993389", "Rafan"));
        empListSorted.add(new EmployeeImpl("8349343", "Madhusha"));
        empListSorted.add(new EmployeeImpl("8643864", "Gamil"));
        empListSorted.add(new EmployeeImpl("9265537", "Lakshak"));
        empListSorted.add(new EmployeeImpl("9368243", "Laavanya"));
        empListSorted.add(new EmployeeImpl("9728329", "Erin"));
    }
}
