package LinkedList.SinglyLinkedList;

public class TestClass {
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = InsertHead.insert(head, 5);
        // PrintList.print(head);
        // head = InsertEnd.insert(head, 200);
        // PrintList.print(head);
        // head = InsertKthPosition.insert(head, 2, 1000);
        // PrintList.print(head);
        // head = DeleteHead.delete(head);
        // PrintList.print(head);
        // head = DeleteEnd.delete(head);
        // PrintList.print(head);
        //head = InsertSortList.sort(head, 25);
        //PrintList.print(head);
       // FindMiddleElement.printMiddle(head);
       FindNthNode.printNthEff(head, 2);
       FindNthNode.printNthEff(head, 2);
    }
}
