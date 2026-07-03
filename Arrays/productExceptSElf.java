package Arrays;
import java.util.*;
public class productExceptSElf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();

        int ans[]=product(nums);
        System.out.println(product(ans));
    }

    public static int[] product(int nums[]){
        int n=nums.length;
        int []left=new int[n];
        int right[]=new int[n];
        int result[]=new int[n];

        left[0]=1;
        for(int i=1;i<left.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        left[n-1]=1;
        for(int i=n-2;i>=0;i++){
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}
