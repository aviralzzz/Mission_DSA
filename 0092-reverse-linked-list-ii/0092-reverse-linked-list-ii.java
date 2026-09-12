/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        for(int i=0;i<left-1;i++)
        {
            temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head1=temp.next;
        for(int i=0;i<right-left+1;i++)
        {
            temp=temp.next;

        }
        ListNode tail2=temp;
        ListNode head2=temp.next;

        tail1.next=null;
        tail2.next=null;

        ListNode p=null;
        ListNode f=null;
        ListNode curr=head1;
        while(curr!=null)
        {
            f=curr.next;
            curr.next=p;
            p=curr;
            curr=f;
        }
        
        tail1.next=tail2;
        head1.next=head2;
        return dummy.next;





        // if (head == null || left == right) {
        //     return head;
        // }
        // ListNode a=head;
        // ListNode b=head;
        // for(int i=1;i<left-1;i++)
        // {
        //     a=a.next;
        // }
        // for(int i=1;i<right;i++)
        // {
        //     b=b.next;
        // }
        // ListNode c=a.next;
        // a.next=null;
        // ListNode d=b.next;
        // b.next=null;
        // ListNode p=null;
        // ListNode f=null;
        // ListNode curr=c;
        // while(curr!=null)
        // {
        //     f=curr.next;
        //     curr.next=p;
        //     p=curr;
        //     curr=f;
        // }
        // ListNode temp=p;
        // for(int i=1;i<(right-left+1);i++)
        // {
        //     temp=temp.next;
        // }
        // a.next=p;
        // if()
        // temp.next=d;
        // return a;


        
    }
}