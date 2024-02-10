package LinkedList.CircularLinkedList;

public class InsertHead {
    public static Node insert(Node head, int data){
        Node temp=new Node(data);
        if(head==null)
            temp.next=temp;
        else{
            Node curr=head;
            while(curr.next!=head)
                curr=curr.next;
            curr.next=temp;
            temp.next=head;
        }
        return temp;
    }
    static Node insertEfficient(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return head;
        }
    }
}
