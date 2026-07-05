package LinkedList;
import java.util.*;
public class nthNodefromEnd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
 
        Node head=build(arr);
        int nth=sc.nextInt();
        System.out.println(nth(head,nth));

        sc.close();
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static Node build(int arr[]){
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

    public static int nth(Node head,int nth){
        Node first=head;
        Node second=head;
        for(int i=0;i<nth;i++){
            first=first.next;
        }

        while(first!=null){
            first=first.next;
            second=second.next;
        }
        return second.data;
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