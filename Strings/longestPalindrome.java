package Strings;

public class longestPalindrome {
    static int start=0;
    static int maxLength=0;

    public static void expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        int len=right-left;

        if(len>maxLength){
            maxLength=len;
            start=left+1;
        }
    }

    public static String longest(String s){
        for(int i=0;i<s.length();i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(start,start+maxLength);
    }
}
