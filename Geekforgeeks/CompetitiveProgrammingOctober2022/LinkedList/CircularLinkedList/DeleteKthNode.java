package LinkedList.CircularLinkedList;

public class DeleteKthNode {
    static Node delete(Node head,int k){
        if(head==null)return head;
        if(k==1)return DeleteHead.delete(head);
        Node curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }
}
