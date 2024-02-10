package LinkedList.DoublyLinkedList;

public class DeleteTail {
    public static Node delete(Node head){
        if(head == null){
            return head;
        }
        Node curr = head;

        if(head.next == null){
            return null;
        }else{
            while(curr.next != null){
                curr = curr.next;
            }
            curr.prev.next = null;
        }
        return head;
    }
}
