package Heaps;

import java.util.*;

public class topKfrequent {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        top(arr, k);

        sc.close();
    }

    public static void top(int arr[], int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap based on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);

        // Step 3: Maintain heap of size k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            pq.offer(new Pair(entry.getKey(), entry.getValue()));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Print answer
        while (!pq.isEmpty()) {
            System.out.print(pq.poll().num + " ");
        }
    }
}

class Pair {

    int num;
    int freq;

    Pair(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}