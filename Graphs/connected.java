package Graphs;

import java.util.*;

public class connected {

    public static void dfs(int node,
                           ArrayList<ArrayList<Integer>> adj,
                           boolean visited[]) {

        visited[node] = true;

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                dfs(neighbour, adj, visited);

            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            adj.add(new ArrayList<>());

        }

        for (int i = 0; i < m; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);

        }

        boolean visited[] = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                dfs(i, adj, visited);

                count++;

            }

        }

        System.out.println(count);

        sc.close();
    }
}