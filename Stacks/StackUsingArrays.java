package Stacks;


public class StackUsingArrays {
    public static void main(String args[]){
        int stack[]=new int[5];
        push(stack,6);
        push(stack,8);
    }

    static int top=-1;
    public static void push(int stack[],int value){
        if(top==stack.length-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        stack[top]=value;
    }

    public static int pop(int stack[]){
        if(top==-1){
            System.out.println("Underflow");
            return top;
        }

        int value=stack[top];
        top--;
        return value;
    }

    public static void isEmpty(int stack[]){
        if(top==-1){
            System.out.println("It is empty");
            return;
        }
    }

    public static int peek(int stack[]){
        if(top==-1){
            System.out.println("It is empty");
            return -1;
        }
        return stack[top];
    }
}
