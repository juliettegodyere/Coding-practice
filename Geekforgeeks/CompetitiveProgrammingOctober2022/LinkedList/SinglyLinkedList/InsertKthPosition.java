package LinkedList.SinglyLinkedList;

public class InsertKthPosition {
    public static Node insert(Node head, int pos,int data) {
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for(int i = 1; i <= pos-2 && curr != null; i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}
