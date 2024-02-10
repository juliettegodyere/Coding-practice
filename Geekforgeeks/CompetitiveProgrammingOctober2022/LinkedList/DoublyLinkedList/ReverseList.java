package LinkedList.DoublyLinkedList;

public class ReverseList {
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        if(prev != null){
            head = prev.prev;
        }
        return head;
    }
}
