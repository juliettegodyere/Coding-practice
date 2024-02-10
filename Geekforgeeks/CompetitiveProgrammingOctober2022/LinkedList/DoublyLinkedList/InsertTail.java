package LinkedList.DoublyLinkedList;

public class InsertTail {
    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        
        return head;
    }
}
