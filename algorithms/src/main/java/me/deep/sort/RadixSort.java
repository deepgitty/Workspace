package me.deep.sort;

/**
 * Radix sort algorithm. This is a Java Program to implement Radix Sort Algorithm.
 * This program is to sort a list of numbers.
 * <p>
 * Saale khud samajh ke ise likh.
 *
 * @author Gagandeep Singh
 */
public class RadixSort {

    public static void sort(int[] a) {

        int i;
        int max = a[0];
        int exp = 1;
        int length = a.length;

        int[] b = new int[10];

        for (i = 1; i < length; i++) {
            if (a[i] > max)
                max = a[i];       // Finding the largest element
        }

        while (max / exp > 0) {
            int[] bucket = new int[10];

            for (i = 0; i < length; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = length - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < length; i++)
                a[i] = b[i];
            exp *= 10;
        }
    }

    public static void main(String[] args) {

        int[] a = {50, 30, 60, 70, 10, 40};
        RadixSort.sort(a);
        System.out.println(a);
    }
}
