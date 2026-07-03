package Arrays;
import java.util.*;

public class maxOnes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(consecutive(nums));
    }   

    public static int consecutive(int[] nums){
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
                if(count>maxCount){
                    maxCount=count;
                }
            }else{
                count=0;
            }

        }
        return maxCount;
    }
}
