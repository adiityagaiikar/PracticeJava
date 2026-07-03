package Arrays;
import java.util.*;

public class moveZeros {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();

        sort(nums);
        System.out.println(Arrays.toString(nums));
    }    

    public static void sort(int nums[]){
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,pointer);
                pointer++;
            }
            
        }

    }

    public static void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
