package Greedy;

import java.util.*;

public class jumpGame {

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

    public static boolean solve(int[] nums){

        int maxReach = 0;

        for(int i = 0; i < nums.length; i++){

            if(i > maxReach){
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}