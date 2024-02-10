package LinkedList.SinglyLinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class SegregateEvenOldNode {
    static void evenOld(Node head){
        Node curr;
        int count = 0;
       for(curr = head; curr != null; curr = curr.next){
            count++;
       }

       while(curr != null && curr.next != null){
         if(curr.data % 2 != 0){
            curr.next = curr.next.next;
            
         }
       }
     
    }
}
