package Arrays;

import java.util.Scanner;

public class sumcircularSubArray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(maxSubarraySumCircular(nums));

        sc.close();
    }

    private static int maxSubarraySumCircular(int[] nums) {
        int total=0;

        int currMax=0;
        int maxSum=nums[0];

        int currMin=0;
        int minSum=nums[0];

        for(int num:nums){
            currMax=Math.max(num,currMax+num);
            maxSum=Math.max(maxSum,currMax);

            currMin=Math.max(num,currMin+num);
            minSum=Math.max(maxSum,currMin);

            total=total+num;
        }

        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum,total-minSum);
    }
}
