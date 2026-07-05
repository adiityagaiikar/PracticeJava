package Stacks;
import java.util.*;

public class simplifyPath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(simplify(s));
    }

    public static String simplify(String s){
        Stack<String> st=new Stack<>();
        s=s.trim();
        String parts[]=s.split("/");

        for(String part:parts){
            if(part.equals("")|| part.equals(".")){
                continue;
            }

            if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(part);
            }
        }

        StringBuilder ans=new StringBuilder();
        for(String x:st){
            ans.append("/").append(x);
        }
        return ans.length()==0?"/":ans.toString();
    }
}
