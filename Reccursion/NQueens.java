package Reccursion;

import java.util.*;

public class NQueens {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }

        solve(0, board, ans);

        System.out.println(ans);
    }

    public static void solve(int col, char[][] board, List<List<String>> ans){

        if(col == board.length){

            List<String> temp = new ArrayList<>();

            for(char[] row : board){
                temp.add(new String(row));
            }

            ans.add(temp);
            return;
        }

        for(int row = 0; row < board.length; row++){

            if(isSafe(row, col, board)){

                board[row][col] = 'Q';

                solve(col + 1, board, ans);

                board[row][col] = '.';
            }
        }
    }

    public static boolean isSafe(int row, int col, char[][] board){

        // Left
        for(int j = col - 1; j >= 0; j--){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // Upper Left Diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Lower Left Diagonal
        for(int i = row + 1, j = col - 1;
            i < board.length && j >= 0;
            i++, j--){

            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
}