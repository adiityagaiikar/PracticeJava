package Stacks;
import java.util.*;

public class ValidParenthesis {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(parenthesis(s));
    }

    public static boolean parenthesis(String s){
        Stack<Character> st=new Stack<>();
        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('||ch[i]=='['||ch[i]=='{'){
                st.push(ch[i]);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if(ch[i]==']' && top=='['||
                    ch[i]=='}' && top=='{'||
                    ch[i]==')' && top=='('
                ){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
