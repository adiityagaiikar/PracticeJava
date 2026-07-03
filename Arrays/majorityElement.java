package Arrays;
import java.util.*;
public class majorityElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
    }

    public static int majority(int nums[]){
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count=count+1;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
