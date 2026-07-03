package Strings;
import java.util.*;

public class palindrome {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        System.out.println(ispalin(s));
    }

    public static boolean ispalin(String s){

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}