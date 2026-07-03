package Arrays;
import java.util.*;

public class bestTimeToStocks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(maxReturn(nums));
    }

    public static int maxReturn(int nums[]){
        int min=nums[0];
        int profitmax=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }

            int profit=nums[i]-min;
            if(profit>profitmax){
                profitmax=profit;
            }
        }
        return profitmax;
    }
}
