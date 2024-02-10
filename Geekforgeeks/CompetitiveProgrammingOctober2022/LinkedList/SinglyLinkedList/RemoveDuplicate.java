package LinkedList.SinglyLinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class RemoveDuplicate {
    static void removeDuplicate(Node head){
        Node curr = head;

        while(curr != null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr.next = curr.next;
            }
            
        }
    }
}
