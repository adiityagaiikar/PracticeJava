package Hashing;
import java.util.*;

public class StringCompression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=compress(s);
        System.out.println(ans);
        sc.close();
    }

    private static String compress(String s) {
        String result="";
        int i=0;
        while(i<s.length()){
            char current=s.charAt(i);
            int count=0;

            while(i<s.length() && s.charAt(i)==current){
                count++;
                i++;
            }

            result=result+current;
            if(count>1){
                result=result+count;
            }
        }
        return result;
    }
}
