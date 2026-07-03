package Hashing;

import java.util.*;

public class GroupAnagrams {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        sc.close();

        List<List<String>> ans = groupAnagram(strs);

        for (List<String> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<String>> groupAnagram(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}