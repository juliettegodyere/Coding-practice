package LinkedList.SinglyLinkedList;

public class SearchKthValue {
    public static int search(Node head,int data) {
        int pos = 1;
        Node curr = head;
        
        while(curr != null){
            if(curr.data == data)  {
                return pos;
            } else{
                pos++;
                curr = curr.next;
            } 
        }
        return -1;
        
    }
    static int search2(Node head, int x){
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=search(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
    }
    public static void main(String[] args) {
        Node head =new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
        System.out.println(search(head, 100)); 
    }
}
