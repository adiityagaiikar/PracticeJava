package Stacks;

public class QueueUsingArrays {

    static int front = -1;
    static int rear = -1;

    public static void main(String args[]) {

        int[] queue = new int[5];

        push(queue, 10);
        push(queue, 20);
        push(queue, 30);

        System.out.println(pop(queue));
        System.out.println(peek(queue));

        push(queue, 40);
        push(queue, 50);

        while(!isEmpty()){
            System.out.println(pop(queue));
        }
    }

    public static void push(int[] queue, int value){

        if(rear == queue.length - 1){
            System.out.println("Queue Overflow");
            return;
        }

        if(front == -1){
            front = 0;
        }

        queue[++rear] = value;
    }

    public static int pop(int[] queue){

        if(front == -1 || front > rear){
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];
        front++;

        if(front > rear){
            front = -1;
            rear = -1;
        }

        return value;
    }

    public static int peek(int[] queue){

        if(front == -1){
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front];
    }

    public static boolean isEmpty(){

        return front == -1;
    }
}