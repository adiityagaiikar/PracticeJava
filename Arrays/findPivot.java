package Arrays;
import java.util.*;

public class findPivot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(find(nums));
        sc.close();
    }

    public static int find(int nums[]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=sum-nums[i]-leftSum;
            if(rightSum==leftSum){
                return i;
            }
            leftSum=leftSum+nums[i];
        }
        return -1;
    }
}
