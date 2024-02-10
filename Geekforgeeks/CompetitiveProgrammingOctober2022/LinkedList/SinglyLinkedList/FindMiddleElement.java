/**
 * The Efficient approach used the fast and slow two pointer technique
 */
package LinkedList.SinglyLinkedList;

public class FindMiddleElement {
    static void printMiddle(Node head){
        if(head==null)return;
        int count=0;
        Node curr;
        for(curr=head;curr!=null;curr=curr.next)
            count++;
        curr=head;
        for(int i=0;i<count/2;i++)
            curr=curr.next;
        System.out.print(curr.data);
    }
    static void printMiddleEff(Node head){
        if(head==null)return;
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
}
