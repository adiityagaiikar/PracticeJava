package LinkedList;
import java.util.*;
public class searchNode {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int target = sc.nextInt();
        Node head=build(arr);
        System.out.println(search(head,target));
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

    public static int search(Node head,int target){
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return temp.data;
            }
            temp=temp.next;
        }
        return -1;
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