package me.deep.cc.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Generic test for all the sorting algorithms.
 * I meant to sort numerical and lexicographical sort.
 *
 * @author Gagandeep Singh
 */
public class SortingTest {

    private int[] unsortedArray;
    private int[] sortedArray;

    @Before
    public void getTestData() {
        generateArrayData();
    }

    @Test
    public void testSort() throws Exception {

        Sorting sort = new QuickSort();
        int[] actual = sort.sort(unsortedArray);
        Assert.assertArrayEquals("Expected and actual array are unequal", sortedArray, actual);
    }

    @Test
    public void testNull() throws Exception {

        Sorting sort = new QuickSort();
        int[] sortedArray = sort.sort(null);
        int length = sortedArray.length;
        System.out.println("Length : " + length);
        for (int element : sortedArray) {
            System.out.println("Element : " + element);
        }
    }

    private void generateArrayData() {
        unsortedArray = new int[20];
        unsortedArray[0] = 7;
        unsortedArray[1] = 10;
        unsortedArray[2] = 4;
        unsortedArray[3] = 3;
        unsortedArray[4] = 20;
        unsortedArray[5] = 15;
        unsortedArray[6] = -1;
        unsortedArray[7] = 12;
        unsortedArray[8] = -5;
        unsortedArray[9] = 7;
        unsortedArray[10] = 19;
        unsortedArray[11] = -17;
        unsortedArray[12] = 8;
        unsortedArray[13] = 13;
        unsortedArray[14] = 2;
        unsortedArray[15] = 6;
        unsortedArray[16] = 11;
        unsortedArray[17] = 16;
        unsortedArray[18] = -19;
        unsortedArray[19] = -1;

        sortedArray = new int[20];
        sortedArray[0] = -19;
        sortedArray[1] = -17;
        sortedArray[2] = -5;
        sortedArray[3] = -1;
        sortedArray[4] = -1;
        sortedArray[5] = 2;
        sortedArray[6] = 3;
        sortedArray[7] = 4;
        sortedArray[8] = 6;
        sortedArray[9] = 7;
        sortedArray[10] = 7;
        sortedArray[11] = 8;
        sortedArray[12] = 10;
        sortedArray[13] = 11;
        sortedArray[14] = 12;
        sortedArray[15] = 13;
        sortedArray[16] = 15;
        sortedArray[17] = 16;
        sortedArray[18] = 19;
        sortedArray[19] = 20;
    }
}
