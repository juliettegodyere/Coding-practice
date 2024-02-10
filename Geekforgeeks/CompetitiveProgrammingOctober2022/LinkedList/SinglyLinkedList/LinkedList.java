package LinkedList.SinglyLinkedList;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class LinkedList {


    public static void printList(Node node){
        if(node == null){
            return;
        }
        Node temp = node;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);

       printList(head);
    } 
}
