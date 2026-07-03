package SelectionSort;
import java.util.*;

public class bubble {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
    }

    public static void solve(int nums[],int n){

        while(n>=1){
            for(int i=0;i<n-1;i++){
                if(nums[i]<nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
        }
        solve(nums,n-1);
    }

    private static void swap(int[] nums, int a, int b) {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
