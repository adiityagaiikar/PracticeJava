package Hashing;

import java.util.*;

public class topfrequentk {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        sc.close();

        int[] ans = frq(nums, k);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] frq(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}