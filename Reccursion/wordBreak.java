package Reccursion;

import java.util.*;

public class wordBreak {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        List<String> wordDict = new ArrayList<>();

        for(int i = 0; i < n; i++){
            wordDict.add(sc.nextLine());
        }

        sc.close();

        System.out.println(solve(0, s, new HashSet<>(wordDict)));
    }

    public static boolean solve(int index, String s, HashSet<String> set){

        if(index == s.length()){
            return true;
        }

        for(int i = index; i < s.length(); i++){

            String word = s.substring(index, i + 1);

            if(set.contains(word)){

                if(solve(i + 1, s, set)){
                    return true;
                }
            }
        }

        return false;
    }
}