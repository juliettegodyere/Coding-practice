package LinkedList.SinglyLinkedList;

import java.util.ArrayList;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
  
public class ReverseLinkeList {
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	printlist(head);
    	head=revList(head);
    	printlist(head);
    	
    } 
    
    static Node revList(Node head){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(Node curr=head;curr!=null;curr=curr.next){
            arr.add(curr.data);
        }
        for(Node curr=head;curr!=null;curr=curr.next){
            curr.data=arr.remove(arr.size()-1);
        }
        return head;
    }

    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
