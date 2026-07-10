package Graphs;
import java.util.*;

public class dfs {

    public static void dfs1(int node,
                           ArrayList<ArrayList<Integer>> adj,
                           boolean visited[]) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                dfs1(neighbour, adj, visited);

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

        dfs1(0, adj, visited);

        sc.close();
    }
}