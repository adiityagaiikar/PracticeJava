package Arrays;

import java.util.*;

public class findRepeatingNMissing {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        int[] ans = find(nums);
        System.out.println("Repeating = " + ans[0]);
        System.out.println("Missing = " + ans[1]);
    }

    public static int[] find(int[] arr){

        int n = arr.length;
        int[] freq = new int[n + 1];

        for(int x : arr){
            freq[x]++;
        }

        int repeating = -1;
        int missing = -1;

        for(int i = 1; i <= n; i++){

            if(freq[i] == 2){
                repeating = i;
            }

            if(freq[i] == 0){
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    }
}