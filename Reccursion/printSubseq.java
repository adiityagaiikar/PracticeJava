package Reccursion;
import java.util.*;

public class printSubseq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        ArrayList<Integer>list=new ArrayList<>();
        print(0,nums,list);
    }

    public static void print(int index,int[] arr,ArrayList<Integer> list){
        if(index==arr.length){
            System.out.println(list);
            return;
        }

        //take
        list.add(arr[index]);
        print(index+1,arr,list);

        //remove
        list.remove(list.size()-1);

        //not take
        print(index+1,arr,list);
    }
}
