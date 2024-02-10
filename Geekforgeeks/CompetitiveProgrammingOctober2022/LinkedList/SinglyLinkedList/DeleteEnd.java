package LinkedList.SinglyLinkedList;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data = x;
//         next = null;
//     }
// }

public class DeleteEnd {
    public static Node delete(Node head){
        if(head == null || head.next == null){
            return null;
        }
        
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static void printlist(Node head){
        Node curr = head;

        while(curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static void main(String args[]){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        delete(head);
        printlist(head);
    }
}
