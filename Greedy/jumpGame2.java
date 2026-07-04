package Greedy;

import java.util.*;

public class jumpGame2 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(solve(nums));
    }

    public static int solve(int[] nums){

        if(nums.length == 1){
            return 0;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i = 0; i < nums.length - 1; i++){

            farthest = Math.max(farthest, i + nums[i]);

            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}