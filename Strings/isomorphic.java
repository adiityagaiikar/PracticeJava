package Strings;

import java.util.*;


public class isomorphic {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(isomorphic1(s, t));

        sc.close();
    }

    public static boolean isomorphic1(String s, String t) {

        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map1.containsKey(c1) && map1.get(c1) != c2)
                return false;

            if(map2.containsKey(c2) && map2.get(c2) != c1)
                return false;

            map1.put(c1, c2);
            map2.put(c2, c1);
        }

        return true;
    }
}

