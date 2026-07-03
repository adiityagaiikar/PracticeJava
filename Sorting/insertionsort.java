package Sorting;
import java.util.*;

public class insertionsort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();

        insertion(nums);
    }

    public static void insertion(int []nums){
        for(int i=1;i<nums.length;i++){
            int current=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>current){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }    
    }
}
