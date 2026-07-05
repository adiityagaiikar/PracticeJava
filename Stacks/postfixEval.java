package Stacks;
import java.util.*;

public class postfixEval {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(eval(s));
    }


    public static int eval(String s){
        s=s.trim();
        Stack<Integer>st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
                int a=st.pop();
                int b=st.pop();
                switch(ch){
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                        st.push(b-a);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                        st.push(b/a);
                        break;
                    default:
                        break;
                }
            }
        }
        return st.pop();
    }
}
