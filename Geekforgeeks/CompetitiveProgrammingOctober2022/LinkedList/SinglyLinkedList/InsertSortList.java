/**
 * We are required to insert the given value in the correct position while
 * maitaining the sorting pattern.
 */
package LinkedList.SinglyLinkedList;

public class InsertSortList {
    public static Node sort(Node head, int data){
        Node newNode = new Node(data);

        Node curr = head;
        if(head == null){
            return newNode;
        }
        if(data < head.data){
            newNode.next = head;
            return newNode;
        }
        while(curr.next != null && curr.data < data){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
