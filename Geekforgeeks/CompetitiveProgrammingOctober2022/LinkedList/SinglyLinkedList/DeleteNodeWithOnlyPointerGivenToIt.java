package LinkedList.SinglyLinkedList;

class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

public class DeleteNodeWithOnlyPointerGivenToIt {
    /**
     * Embark on a captivating quest through the intricate tapestry of linked lists, where nodes intertwine to 
     * form pathways of knowledge. Embrace the thrill of unraveling connections, as you master the art of organizing 
     * and accessing information. In this section, we will learn about: Delete Node with Only Pointer given to it
     */

     public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	Node ptr=new Node(30);
	    head.next.next=ptr;
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(25);
    	printlist(head);
	    deleteNode(ptr);
    	printlist(head);
    } 
    
    static void deleteNode(Node ptr){
        ptr.data=ptr.next.data;
        ptr.next=ptr.next.next;
    }
    
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }System.out.println();
    }
}
