package Strings;
import java.util.*;

public class StringCompression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        sc.close();
    }

    public static String ans(String s){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<s.length();i++){
            while(i<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }

            sb.append(s.charAt(i));

            if(count>1){
                sb.append(count);
            }
            count=1;
        }
        return sb.toString();
    }
}
