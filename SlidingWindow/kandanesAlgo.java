package SlidingWindow;
import java.util.*;

public class kandanesAlgo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(maxSum1(nums));
    }

    public static int maxSum1(int nums[]){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            
            if(sum>maxSum){
                maxSum=sum;
            }
            
            sum=sum+nums[i];
            if(sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
}
