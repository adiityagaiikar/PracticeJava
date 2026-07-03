package Arrays;

import java.util.*;

public class mergeintervals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        sc.close();

        int[][] result = merged(intervals);

        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }

    public static int[][] merged(int[][] intervals) {

        if (intervals.length == 0) {
            return new int[0][0];
        }

        // Sort by starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (current[1] >= intervals[i][0]) {
                // Merge intervals
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap
                ans.add(current);
                current = intervals[i];
            }
        }

        ans.add(current);

        return ans.toArray(new int[ans.size()][]);
    }
}