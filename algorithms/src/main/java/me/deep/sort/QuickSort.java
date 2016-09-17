package me.deep.sort;

/**
 * Quick me.deep.sort algorithm.
 * <p>
 * Quick me.deep.sort algorithm makes use of the pivot. It sorts the array by
 * </p>
 *
 * @author Gagandeep Singh
 * @complexity("best") n log n
 * @complexity("average") n log n
 * @complexity("worst") n^2
 * @memory Average: log n; Worst: n (Sedgewick variation is log n worst case)
 * @stable Typical in-place me.deep.sort is not stable, but stable versions exist.
 * @type Partitioning
 */
public class QuickSort {

    public final static <T extends Comparable> void sort(T[] unsortedArray) {

        int head = 0;
        int tail = unsortedArray.length - 1;

        quickSort(unsortedArray, head, tail);
    }

    private final static <T extends Comparable> void quickSort(T[] arr, int head, int tail) {

        int start = head;
        int end = tail;
        int pivotIndex = (head + tail) / 2;
        T pivot = arr[pivotIndex];

        while (start <= end) {

            while (arr[start].compareTo(pivot) < 0) {
                ++start;
            }
            while (arr[end].compareTo(pivot) > 0) {
                --end;
            }
            if (start <= end) {
                swap(arr, start, end);
                ++start;
                --end;
            }
        }

        if (head < end) {
            quickSort(arr, head, end);
        }
        if (start < tail) {
            quickSort(arr, start, tail);
        }
    }

    private final static <T> void swap(T[] arr, int from, int to) {

        T headType = arr[from];
        arr[from] = arr[to];
        arr[to] = headType;
    }
}
