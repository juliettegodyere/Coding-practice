package LinkedList.SinglyLinkedList;

public class DeleteHead {
    public static Node delete(Node head){
        if(head == null){
           return null;
        }else{
             return head.next;
        }
       
    }

    public static void printlist(Node head){
        Node curr = head;

        while(curr != null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static void main(String args[]){
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	printlist(head);
    	head=delete(head);
	    printlist(head);
    }
}
