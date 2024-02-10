package LinkedList.SinglyLinkedList;

public class InsertMiddle {
    static Node insertMiddle(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            return newNode;
        }
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}
