package Stacks;

import java.util.*;

public class StackUsingQueue {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public static void main(String args[]){

        push(10);
        push(20);
        push(30);

        System.out.println(pop());
        System.out.println(top());

        push(40);

        while(!isEmpty()){
            System.out.println(pop());
        }
    }

    public static void push(int x){
        q1.offer(x);
    }

    public static int pop(){

        if(isEmpty()){
            return -1;
        }

        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int ans = q1.poll();

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        return ans;
    }

    public static int top(){

        if(isEmpty()){
            return -1;
        }

        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int ans = q1.peek();

        q2.offer(q1.poll());

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        return ans;
    }

    public static boolean isEmpty(){
        return q1.isEmpty();
    }
}