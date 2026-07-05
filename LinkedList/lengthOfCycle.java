package LinkedList;

import java.util.*;
public class lengthOfCycle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }

    public static int length(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                int count=1;
                Node temp=slow.next;
                while(temp!=slow){
                    count++;
                    temp=temp.next;
                }
                return count;
            }
        }
        return -1;
    }

    public static Node build(int[] arr){
        if(arr.length==0){
            return null;
        }

        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
}
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}