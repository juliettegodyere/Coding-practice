package LinkedList.CircularLinkedList;

public class InsertTail {
    public static Node insert(Node head, int data){
        Node temp=new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;

        return head;
    }
    public static Node insertEfficient(Node head, int data){
        Node temp=new Node(data);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = temp.data;
        temp.data = head.data;
        head.data = t;

        return temp;
    }
}
