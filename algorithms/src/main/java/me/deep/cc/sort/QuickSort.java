package me.deep.cc.sort;

import java.util.Random;

/**
 * Quick Sort sorting algorithm implementation in java.
 * Working of Quick Sort algorithm.
 * <p>
 * 1. Select pivot.
 * 2. On the basis of pivot, divide array into 2 sub arrays.
 * 3. Recursively sort the sub arrays too.
 * </p>
 *
 * @author Gagandeep Singh
 * @version 1.0 {Numerical Sort}
 */
public class QuickSort implements Sorting {

    private int[] cachedArray;

    /**
     * Implements the sorting logic inside this method.
     *
     * @param unsorted : This is the supplied array, meant to be sorted.
     * @return A sorted array.
     */
    public int[] sort(int[] unsorted) throws NullReferenceException {

        System.out.println("Starting sorting of " + unsorted);
        if (unsorted == null) {
            throw new NullReferenceException("Provided unsorted array can't be null");
        }
        this.cachedArray = unsorted;
        quickSort(0, unsorted.length - 1);
        return cachedArray;
    }

    private void quickSort(int startIndex, int endIndex) {

        int pivot = cachedArray[getPivot(startIndex, endIndex)];
        System.out.println("Chosen pivot for sub array [" + startIndex + " to " + endIndex + "] is : " + pivot);
        int initialStartIndex = startIndex;
        int initialEndIndex = endIndex;

        while (startIndex <= endIndex) {
            System.out.println("Starting index : " + startIndex);
            System.out.println("Ending index : " + endIndex);

            while (cachedArray[startIndex] < pivot) {
                startIndex++;
            }
            while (cachedArray[endIndex] > pivot) {
                endIndex--;
            }

            System.out.println("Swapping index " + startIndex + " with " + endIndex);
            if (startIndex <= endIndex) {
                swap(startIndex, endIndex);
                startIndex++;
                endIndex--;
            }

            System.out.println("Array after pass : " + cachedArray);
        }

        if (initialStartIndex < endIndex) {
            System.out.println("Perform recursive for indices : [" + initialStartIndex + ", " + endIndex + "]");
            quickSort(initialStartIndex, endIndex);
        }
        if (startIndex < initialEndIndex) {
            System.out.println("Perform recursive for indices : [" + startIndex + ", " + initialEndIndex + "]");
            quickSort(startIndex, initialEndIndex);
        }
    }

    /**
     * For quick sort we need the pivot element, for this we are using the random function provided by java.
     *
     * @param min The range with the lower number
     * @param max The range with the higher number
     * @return A random number between the given (min to max) range.
     */
    private int getPivot(int min, int max) {
        System.out.println("Generating pivot");
        return new Random().nextInt((max - min) + 1) + min;
    }

    private void swap(int firstIndex, int lastIndex) {
        int cacheFirstElement = cachedArray[firstIndex];
        cachedArray[firstIndex] = cachedArray[lastIndex];
        cachedArray[lastIndex] = cacheFirstElement;
    }
}