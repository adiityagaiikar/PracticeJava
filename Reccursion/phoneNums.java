package Reccursion;

import java.util.*;

public class phoneNums {

    static String[] keypad = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String digits = sc.nextLine();
        sc.close();

        if(digits.length() == 0){
            return;
        }

        ArrayList<String> ans = new ArrayList<>();

        solve(0, digits, "", ans);

        System.out.println(ans);
    }

    public static void solve(int index, String digits, String current, ArrayList<String> ans){

        if(index == digits.length()){
            ans.add(current);
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for(int i = 0; i < letters.length(); i++){
            solve(index + 1, digits, current + letters.charAt(i), ans);
        }
    }
}