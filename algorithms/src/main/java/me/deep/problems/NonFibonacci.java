package me.deep.problems;

import java.util.Arrays;

/**
 * <pre>
 * Given a positive integer n, the task is to print the n^th non Fibonacci number.
 * The Fibonacci numbers are defined as:
 *
 * Fib(0) = 0
 * Fib(1) = 1
 * for n > 1, Fib(n) = Fib(n-1) + Fib(n-2)
 * First few Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 141, ……..
 *
 * Examples:
 *      Input: n = 2
 *      Output: 6
 *
 *      Input: n = 5
 *      Output: 10
 * </pre>
 *
 * @author Gagandeep Singh
 */
public class NonFibonacci {

    private int[] nonFibonacci;
    private int size;

    public int execute(int place) {

        this.size = place;
        nonFibonacci = new int[size];
        findNonFibonacci(2, 3, 0);
        return nonFibonacci[place - 1];
    }

    private void findNonFibonacci(int first, int second, int filled) {

        int diff = second - first;
        if (filled < size) {
            if (diff > 1) {
                for (int i = first + 1; i < second && filled < size; i++) {
                    nonFibonacci[filled++] = i;
                }
            }
            findNonFibonacci(second, first + second, filled);
        }
    }

    @Override
    public String toString() {
        return "NonFibonacci{" +
                "nonFibonacci=" + Arrays.toString(nonFibonacci) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        NonFibonacci fib = new NonFibonacci();
        System.out.println(fib.execute(91));
    }
}
