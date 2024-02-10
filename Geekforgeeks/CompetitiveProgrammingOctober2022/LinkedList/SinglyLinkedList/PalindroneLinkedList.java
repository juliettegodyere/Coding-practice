package LinkedList.SinglyLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

class Node{
        char data;
        Node next;
        Node(char x){
            data=x;
            next=null;
        }
    }
public class PalindroneLinkedList {
    public static void main(String args[]) 
    { 
        Node head=new Node('g');
    	head.next=new Node('f');
    	head.next.next=new Node('g');
    	if(isPalindrome(head))
    	    System.out.print("Yes");
    	else
    	    System.out.print("No");
    	
    } 
    
    static boolean isPalindrome(Node head){
        Deque<Character> stack=new ArrayDeque<Character>();
        for(Node curr=head;curr!=null;curr=curr.next)
            stack.push(curr.data);
        for(Node curr=head;curr!=null;curr=curr.next){
            if(stack.pop()!=curr.data)
                return false;
        }
        return true;
    }
}
