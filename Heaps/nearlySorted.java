package Heaps;
import java.util.*;

public class nearlySorted{

    public static void sortArray(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int index = 0;

        // Insert first k+1 elements
        for (int i = 0; i <= k && i < arr.length; i++) {
            pq.offer(arr[i]);
        }

        // Process remaining elements
        for (int i = k + 1; i < arr.length; i++) {

            arr[index++] = pq.poll();

            pq.offer(arr[i]);
        }

        // Remove remaining elements
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        sortArray(arr, k);

        for (int x : arr)
            System.out.print(x + " ");

        sc.close();
    }
}