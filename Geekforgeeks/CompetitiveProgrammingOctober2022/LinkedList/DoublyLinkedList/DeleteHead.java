package LinkedList.DoublyLinkedList;

public class DeleteHead {
    public static Node delete(Node head){
        
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }

        head = head.next;
        head.prev = null;

        return head;
    }

}
