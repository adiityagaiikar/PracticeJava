package Strings;

import java.util.Scanner;

public class countAndSay {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay1(n));
        sc.close();
    }

    private static String countAndSay1(int n) {
        String ans="1";
        for(int i=2;i<=n;i++){
            StringBuilder temp=new StringBuilder();
            int count=1;
            for (int j = 0; j < ans.length(); j++) {
                if(ans.charAt(j)==ans.charAt(j-1)){
                    count++;
                }else{
                    temp.append(count);
                    temp.append(j-1);
                    count=1;
                }
            }
            temp.append(count);
            temp.append(ans.charAt(ans.length()-1));
            ans=temp.toString();
        }
        return ans;
    }
}
