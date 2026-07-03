package Reccursion;
import java.util.*;

public class countSubseq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();

        int ans=print(0,nums,k,0);
        System.out.println(ans);
    }

    public static int print(int index,int[] arr,int k,int sum){

        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }

        int take=print(0,arr,k,sum+arr[index]);
        int nottake=print(0,arr,k,sum);
        return take+nottake;
    }
}
