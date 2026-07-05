package LinkedList;
import java.util.*;

public class middleElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Node head=build(arr);
        sc.close();
        System.out.println(find(head));
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

    public static int find(Node head){
        Node fast=head;
        Node slow=head;
        while(fast.next!=null || fast!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
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