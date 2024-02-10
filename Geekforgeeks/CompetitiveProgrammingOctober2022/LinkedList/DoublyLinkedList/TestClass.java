package LinkedList.DoublyLinkedList;

public class TestClass {
    public static void main(String args[]){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = InsertHead.insert(head, 5);
        PrintList.print(head);
        head = InsertTail.insert(head, 200);
        PrintList.print(head);
        //head = ReverseList.reverse(head);
       // PrintList.print(head);
        head = DeleteHead.delete(head);
        PrintList.print(head);
        head = DeleteTail.delete(head);
        PrintList.print(head);
    }
}
