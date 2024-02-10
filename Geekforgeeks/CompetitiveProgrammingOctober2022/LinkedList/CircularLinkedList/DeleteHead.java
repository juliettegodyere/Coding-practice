package LinkedList.CircularLinkedList;

public class DeleteHead {
    public static Node delete(Node head){
        if(head == null){
            return head;
        }
        if(head.next == head){
            return null;
        }
        Node curr = head;

        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = head.next;
        return head.next;
    }
    public static Node deleteEfficient(Node head){
        if(head == null){
            return head;
        }
        if(head.next == head){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
