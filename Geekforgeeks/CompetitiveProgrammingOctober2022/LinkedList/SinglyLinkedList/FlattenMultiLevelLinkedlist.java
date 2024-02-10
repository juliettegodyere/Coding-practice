package LinkedList.SinglyLinkedList;
//https://www.youtube.com/watch?v=T6wS3aCaods

   
class Node { 
          
    int data; 
    Node next, child; 
      
    Node(int d) { 
        data = d; 
        next = child = null; 
    } 
} 

public class FlattenMultiLevelLinkedlist {
    public Node flattenNode(Node node){

        if(node == null){
            return node;
        }
        Node start = node;
        Node end = node;
        while(end != null){
            end = end.next;
        }

        while(start != null){
            if(start.child != null){
                end.next = start.child;
                end = end.next;

                while(end.next != null){
                    end = end.next;
                }
            }
            start = start.next;
        }
        return node;
    }
}
