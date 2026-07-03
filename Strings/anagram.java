package Strings;
import java.util.*;

public class anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c=sc.nextLine();
        sc.close();

        System.out.println(ana(s,c));
    }

    public static boolean ana(String s,String c){
        if(s.length()!=c.length()){
            return false;
        }

        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[c.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
