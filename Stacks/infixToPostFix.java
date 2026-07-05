package Stacks;

import java.util.*;

public class infixToPostFix {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        System.out.println(convert(s));
    }

    public static int precedence(char ch){

        if(ch == '+' || ch == '-'){
            return 1;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        else if(ch == '^'){
            return 3;
        }

        return -1;
    }

    public static String convert(String s){

        Stack<Character> st = new Stack<>();

        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()){

            // Operand
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }

            // Opening bracket
            else if(ch == '('){
                st.push(ch);
            }

            // Closing bracket
            else if(ch == ')'){

                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }

                st.pop();
            }

            // Operator
            else{

                while(!st.isEmpty()
                        && precedence(st.peek()) >= precedence(ch)){

                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.toString();
    }
}