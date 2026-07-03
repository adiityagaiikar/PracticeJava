package Arrays;

import java.util.*;

public class uniquePaths {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        System.out.println(unique(m, n));
    }

    public static long unique(int m, int n) {

        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1);

        long ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (N - r + i);
            ans = ans / i;
        }

        return ans;
    }
}