package SelectionSort;

import java.util.Scanner;

public class selectionsort {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();

        selection(nums);
    }

    public static void selection(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int minindex=i;
            for(int j=i+1;i<nums.length-1;i++){
                if(nums[j]<minindex){
                    minindex=nums[j];
                }
            }
            swap(nums,i,minindex);
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
