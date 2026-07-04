package Reccursion;

import java.util.*;

public class subsetsII {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, new ArrayList<>(), ans);

        System.out.println(ans);
    }

    public static void solve(int index, int[] nums,
                             ArrayList<Integer> list,
                             List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));

        for(int i = index; i < nums.length; i++) {

            // Skip duplicates
            if(i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            list.add(nums[i]);

            solve(i + 1, nums, list, ans);

            list.remove(list.size() - 1);
        }
    }
}