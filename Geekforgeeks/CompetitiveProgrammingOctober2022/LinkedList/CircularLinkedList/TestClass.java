package LinkedList.CircularLinkedList;

public class TestClass {
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        PrintList.print(head);
        head = InsertHead.insert(head, 1000);
        PrintList.print(head);
        head = InsertTail.insert(head, 200);
        PrintList.print(head);
        head = DeleteHead.delete(head);
        PrintList.print(head);
        head = DeleteKthNode.delete(head, 3);
        PrintList.print(head);
    }
}
