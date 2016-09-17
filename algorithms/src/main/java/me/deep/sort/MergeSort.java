package me.deep.sort;

/**
 * Merge sort generic algorithm implementation.
 *
 * @author Gagandeep Singh
 */
public class MergeSort<T extends Comparable<T>> {

    private T[] original;
    private T[] temp;

    public void sort(T[] arr) {

        if (arr == null) {
            throw new IllegalArgumentException("Provided array is null");
        }

        int length = arr.length;
        if (length < 2) {
            System.out.println("Array length is less than 1, so sorting not required.");
            return;
        }

        this.original = arr;
        this.temp = (T[]) new Comparable[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int low, int high) {

        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            // Now merge both sides
            merge(low, high, mid);
        }
    }

    private void merge(int low, int high, int mid) {

        for (int i = low; i <= high; i++) {
            temp[i] = original[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i].compareTo(temp[j]) < 0) {
                original[k] = temp[i];
                i++;
            } else {
                original[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            original[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        Integer[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
