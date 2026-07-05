
package LinkedList;
import java.util.*;
public class removenth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
 
        Node head=build(arr);
        int nth=sc.nextInt();
        print(nth(head,nth));

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

    public static Node nth(Node head,int nth){
        Node dummy=new Node(-1);
        dummy.next=head;

        Node first=dummy;
        Node second=dummy;

        for(int i=0;i<=nth;i++){
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }

        second.next=second.next.next;
        return dummy.next;
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