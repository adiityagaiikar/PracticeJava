package Arrays;
import java.util.*;

public class containerWithMostWater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(max(nums));
    }

    public static int max(int nums[]){
        int left=0;
        int right=nums.length-1;
        int maxWater=0;
        while(left<right){
            int width=Math.abs(left-right);
            int height=Math.min(nums[left],nums[right]);
            int area=width*height;
            if(area>maxWater){
                maxWater=area;
            }

            if(nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
