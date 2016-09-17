package me.deep.problems;

import java.util.*;

/**
 * <pre>
 * Find all the possible sub-arrays from a given array.
 * Example:
 *      A[] = [1, 2, 3]
 *      number of sub arrays = 2^3; Hence 2^4 = 8
 *      Sub Arrays:
 *          {}, {1}, {2}, {3},
 *          {1, 2}, {1, 3}, {2,3},
 *          {1, 2, 3}
 * </pre>
 *
 * @author Gagandeep Singh
 */
public class AllSubArrays {

    private static List<String> list;

    public AllSubArrays(int size) {

        int poweredSize = 1;
        for (int i = 0; i < size; i++)
            poweredSize *= 2;
        list = new ArrayList<String>(poweredSize - 1);
    }

    public void getSubArrays(int[] arr, int size) {

        if (arr.length < 1) {
            return;
        }

        if (arr.length == 1) {
            if (list.isEmpty())
                list.add(String.valueOf(arr[0]));
            else {
                ListIterator<String> i = list.listIterator();
                while (i.hasNext()) {
                    i.add(String.valueOf(arr[0]).concat(i.next()));
                }
                list.add(String.valueOf(arr[0]));
            }
            return;
        }

        int[] arr1 = Arrays.copyOfRange(arr, 1, size);
        int[] arr2 = Arrays.copyOfRange(arr, 0, 1);

        getSubArrays(arr1, size - 1);
        getSubArrays(arr2, 1);
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3};
        AllSubArrays xxx = new AllSubArrays(arr.length);
        xxx.getSubArrays(arr, 4);
        System.out.println("List 1 : " + list);
        list.clear();

        int[] arr2 = {0};
        xxx.getSubArrays(arr2, 1);
        System.out.println("List 2 : " + list);
        list.clear();

        int[] arr3 = {0, 1};
        xxx.getSubArrays(arr3, 2);
        System.out.println("List 3 : " + list);
        list.clear();

        int[] arr4 = {0, 1, 2};
        xxx.getSubArrays(arr4, 3);
        System.out.println("List 4 : " + list);
        list.clear();

        int[] arr5 = {};
        xxx.getSubArrays(arr5, arr5.length);
        System.out.println("List 5 : " + list);
        list.clear();
    }
}
