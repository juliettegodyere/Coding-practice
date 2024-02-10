package LinkedList.SinglyLinkedList;

public class InsertHead {
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
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

