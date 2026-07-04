package Reccursion;

import java.util.*;

public class subsetsSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        ArrayList<Integer> ans = new ArrayList<>();

        sum(0, nums, 0, ans);

        Collections.sort(ans);

        System.out.println(ans);
    }

    public static void sum(int index, int[] nums, int sum, ArrayList<Integer> ans){

        if(index == nums.length){
            ans.add(sum);
            return;
        }

        // Take
        sum(index + 1, nums, sum + nums[index], ans);

        // Not Take
        sum(index + 1, nums, sum, ans);
    }
}