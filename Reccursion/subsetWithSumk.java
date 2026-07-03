package Reccursion;
import java.util.*;

public class subsetWithSumk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();

        ArrayList<Integer>list=new ArrayList<>();
        print(0,nums,list,k,0);
    }

    public static void print(int index,int[] arr,ArrayList<Integer> list,int k,int sum){
        if(index==arr.length){
            if(sum==k){
                System.out.println(list);
            }
            return;
        }

        //take
        list.add(arr[index]);
        print(index+1,arr,list,k,sum+arr[index]);

        //remove
        list.remove(list.size()-1);

        //not take
        print(index+1,arr,list,k,sum);
    }
}
