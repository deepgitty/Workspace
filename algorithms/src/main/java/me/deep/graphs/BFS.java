package me.deep.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * BFS : Breadth first search.
 * Makes use of the queue. In queue we can't breathe. Breathe = Queue. Hint
 *
 * @author Gagandeep Singh
 */
public class BFS {

    private int implType = 0;
    private int[][] graphAdjacencyMatrix;
    private Queue<Integer> queue;
    private Stack<Integer> stack;


    public BFS(int[][] graphAdjacencyMatrix) {
        this.graphAdjacencyMatrix = graphAdjacencyMatrix;
        queue = new LinkedList<Integer>();
    }

    // public BFS(LinkedList<T> list) {} future reserved.

    public void process(int source) {

        int visitedCount = -1;
        if (source < 1) {
            throw new IllegalArgumentException("Source can't be less than 1");
        }

        int position = source - 1;
        int[] visited = new int[graphAdjacencyMatrix[source].length];

        visited[++visitedCount] = position;
        /*
        queue.add();
        queue.poll();

        stack.push();
        stack.pop();
        */

    }

    public static void main(String[] args) {

        int[][] graph = new int[6][6];
        graph[0][1] = 1;
        graph[1][0] = 1;
        graph[1][2] = 1;
        graph[2][1] = 1;
        graph[2][3] = 1;
        graph[2][4] = 1;
        graph[2][5] = 1;
        graph[3][2] = 1;
        graph[4][2] = 1;
        graph[5][2] = 1;

        BFS search = new BFS(graph);
        search.process(1);
    }

}
