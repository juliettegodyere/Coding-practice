package LinkedList.DoublyLinkedList;

public class InsertHead {
    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null)
            head.prev = newNode;
        return newNode;
    }
}
