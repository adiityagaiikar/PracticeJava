package Reccursion;
import java.util.*;

class combinationSum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, arr, target, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    public static void solve(int index,int arr[],int target,ArrayList<Integer> list,List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        if(index==arr.length){
            return;
        }

        if(arr[index]<=target){
            list.add(arr[index]);
            solve(index,arr,target-arr[index],list,ans);
            list.remove(list.size()-1);
        }
        solve(index,arr,target,list,ans);
    }
}