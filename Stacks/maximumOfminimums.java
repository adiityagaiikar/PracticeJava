package Stacks;

import java.util.*;

public class maximumOfminimums {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] ans = solve(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int[] arr){

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller Element
        for(int i = 0; i < n; i++){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Smaller Element
        for(int i = n - 1; i >= 0; i--){

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i] = n;
            }else{
                right[i] = st.peek();
            }

            st.push(i);
        }

        int[] ans = new int[n + 1];

        Arrays.fill(ans, Integer.MIN_VALUE);

        for(int i = 0; i < n; i++){

            int len = right[i] - left[i] - 1;

            ans[len] = Math.max(ans[len], arr[i]);
        }

        for(int i = n - 1; i >= 1; i--){
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }

        int[] res = new int[n];

        for(int i = 1; i <= n; i++){
            res[i - 1] = ans[i];
        }

        return res;
    }
}