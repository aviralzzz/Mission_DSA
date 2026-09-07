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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null  && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head=sortList(head);
        head2=sortList(head2);
        return merge(head,head2);
        
    }
    public ListNode merge(ListNode head, ListNode head2)
    {
        ListNode i=head;
        ListNode j=head2;
        ListNode  dummy=new ListNode(-1);
        ListNode t=dummy;
        while(i!=null &&  j!=null)
        {
            if(i.val<=j.val)
            {
                t.next=i;
                i=i.next;
                t=t.next;
            }
            else
            {
                t.next=j;
                j=j.next;
                t=t.next;
            }

        }
        if(i==null)
        {
            t.next=j;
        }
        else
        {
            t.next=i;
        }
        return dummy.next;

    }
}