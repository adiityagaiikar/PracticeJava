package Stacks;
import java.util.*;

public class NSE {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []strs=s.trim().split("\\s+");
        int arr[]=new int[strs.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strs[i]);
        }
        sc.close();
    }

    public static void nse(int arr[]){

    int n = arr.length;

    int[] ans = new int[n];

    Stack<Integer> st = new Stack<>();

    for(int i = n - 1; i >= 0; i--){

        while(!st.isEmpty() && st.peek() >= arr[i]){
            st.pop();
        }

        if(st.isEmpty()){
            ans[i] = -1;
        }else{
            ans[i] = st.peek();
        }

        st.push(arr[i]);
    }

    for(int i = 0; i < n; i++){
        System.out.println(arr[i] + " -> " + ans[i]);
    }
}
}
