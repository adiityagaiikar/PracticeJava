package Reccursion;

import java.util.*;

public class ratInMaze {

    public static void solve(int row, int col,
                             int[][] maze,
                             boolean[][] visited,
                             String path,
                             ArrayList<String> ans) {

        int n = maze.length;

        if(row == n - 1 && col == n - 1){
            ans.add(path);
            return;
        }

        visited[row][col] = true;

        // Down
        if(isSafe(row + 1, col, maze, visited)){
            solve(row + 1, col, maze, visited, path + "D", ans);
        }

        // Left
        if(isSafe(row, col - 1, maze, visited)){
            solve(row, col - 1, maze, visited, path + "L", ans);
        }

        // Right
        if(isSafe(row, col + 1, maze, visited)){
            solve(row, col + 1, maze, visited, path + "R", ans);
        }

        // Up
        if(isSafe(row - 1, col, maze, visited)){
            solve(row - 1, col, maze, visited, path + "U", ans);
        }

        // Backtrack
        visited[row][col] = false;
    }

    private static boolean isSafe(int row, int col,
                                  int[][] maze,
                                  boolean[][] visited) {

        int n = maze.length;

        return row >= 0 &&
               col >= 0 &&
               row < n &&
               col < n &&
               maze[row][col] == 1 &&
               !visited[row][col];
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] maze = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maze[i][j] = sc.nextInt();
            }
        }

        sc.close();

        ArrayList<String> ans = new ArrayList<>();

        if(maze[0][0] == 1){
            boolean[][] visited = new boolean[n][n];
            solve(0, 0, maze, visited, "", ans);
        }

        Collections.sort(ans);

        System.out.println(ans);
    }
}