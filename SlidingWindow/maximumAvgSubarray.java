package SlidingWindow;
import java.util.*;

public class maximumAvgSubarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();

        System.out.println(findMax(nums,k));
    }

    public static double findMax(int[] nums,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int maxSum=sum;

        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return (double) maxSum / k;
    }
}
