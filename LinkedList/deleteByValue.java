
package LinkedList;
import java.util.*;
public class deleteByValue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    
        int value = sc.nextInt();
        Node head=build(arr);
        print(delete(head,value));

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

    public static Node delete(Node head,int val){
        if(head==null){
            return null;
        }

        if(head.data==val){
            return head.next;
        }

        Node curr=head;
        Node prev=null;

        while(curr!=null){
            if(curr.data==val){
                prev.next=curr.next;
                return head;
            }
            prev=curr;
            curr=curr.next;
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