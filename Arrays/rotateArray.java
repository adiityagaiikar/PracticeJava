package Arrays;

import java.util.*;

public class rotateArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    public static int[] rotate(int nums[],int k){
        int n=nums.length;
        int result[]=new int[n];
        k=k%n;
        for(int i=0;i<result.length;i++){
            result[(i+k)%n]=nums[i];
        }
        return result;
    }
}
