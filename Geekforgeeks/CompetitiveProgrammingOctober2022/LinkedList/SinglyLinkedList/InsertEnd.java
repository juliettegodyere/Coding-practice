package LinkedList.SinglyLinkedList;

class Node {
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}

public class InsertEnd {
    Node head;
    public static Node insert(Node head,int data) {
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        } 
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
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
        Node head = null;
        head = insert(head, 10);
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);
        head = insert(head, 30);
        printlist(head);
    }
}
