package LinkedList;

import java.util.*;

public class mergeSorted {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // First Linked List
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        // Second Linked List
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        sc.close();

        Node head1 = build(arr1);
        Node head2 = build(arr2);

        Node ans = merge(head1, head2);

        print(ans);
    }

    public static Node build(int[] arr){

        if(arr.length == 0){
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void print(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static Node merge(Node head1, Node head2){

        Node dummy = new Node(-1);
        Node tail = dummy;

        while(head1 != null && head2 != null){

            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if(head1 != null){
            tail.next = head1;
        }

        if(head2 != null){
            tail.next = head2;
        }

        return dummy.next;
    }
}

class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}