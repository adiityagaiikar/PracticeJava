package Stacks;

import java.util.*;

public class NGE {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] strs = line.trim().split("\\s+");

        int[] arr = new int[strs.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }

        sc.close();

        nge1(arr);
    }

    public static void nge1(int[] arr){

        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--){

            while(!st.isEmpty() && st.peek() <= arr[i]){
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