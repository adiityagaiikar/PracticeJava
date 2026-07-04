package Stacks;

import java.util.*;

public class QueueUsingStacks {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void main(String args[]){

        push(10);
        push(20);
        push(30);

        System.out.println(pop());
        System.out.println(peek());

        push(40);

        while(!isEmpty()){
            System.out.println(pop());
        }
    }

    public static void push(int x){
        s1.push(x);
    }

    public static int pop(){

        if(isEmpty()){
            return -1;
        }

        while(s1.size() > 1){
            s2.push(s1.pop());
        }

        int ans = s1.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return ans;
    }

    public static int peek(){

        if(isEmpty()){
            return -1;
        }

        while(s1.size() > 1){
            s2.push(s1.pop());
        }

        int ans = s1.peek();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return ans;
    }

    public static boolean isEmpty(){
        return s1.isEmpty();
    }
}