package Heaps;

import java.util.*;

public class MergeKSortedArrays {

    public static void merge(int arr[][]) {

        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> a.value - b.value);

        int k = arr.length;

        // Insert first element of every row
        for (int i = 0; i < k; i++) {
            pq.offer(new Node(arr[i][0], i, 0));
        }

        // Merge
        while (!pq.isEmpty()) {

            Node current = pq.poll();

            System.out.print(current.value + " ");

            int nextCol = current.col + 1;

            if (nextCol < arr[current.row].length) {

                pq.offer(new Node(
                        arr[current.row][nextCol],
                        current.row,
                        nextCol));
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[k][n];

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();

            }
        }

        merge(arr);

        sc.close();
    }
}

class Node {

    int value;
    int row;
    int col;

    Node(int value, int row, int col) {

        this.value = value;
        this.row = row;
        this.col = col;
    }
}