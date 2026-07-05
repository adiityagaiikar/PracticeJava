package Stacks;

import java.util.*;

public class asteroidCollision {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] strs = s.trim().split("\\s+");

        int[] arr = new int[strs.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }

        sc.close();

        System.out.println(Arrays.toString(collision(arr)));
    }

    public static int[] collision(int[] asteroids){

        Stack<Integer> st = new Stack<>();

        for(int asteroid : asteroids){

            boolean destroyed = false;

            while(!st.isEmpty() &&
                  asteroid < 0 &&
                  st.peek() > 0){

                if(st.peek() < -asteroid){
                    st.pop();
                }
                else if(st.peek() == -asteroid){
                    st.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }

            if(!destroyed){
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];

        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = st.pop();
        }

        return ans;
    }
}