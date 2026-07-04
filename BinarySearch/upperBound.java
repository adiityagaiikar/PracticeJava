package BinarySearch;

import java.util.*;

public class upperBound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        System.out.println(solve(nums,target));
    }

    public static int solve(int nums[], int target){

    int low = 0;
    int high = nums.length - 1;
    int ans = nums.length;

    while(low <= high){

        int mid = low + (high - low) / 2;

        if(nums[mid] > target){
            ans = mid;
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }

    return ans;
}
}
