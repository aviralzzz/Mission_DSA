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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode t=dummy;
        ListNode t2=dummy2;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                t.next=temp;
                t=temp;
                temp=temp.next;
            }
            else
            {
                t2.next=temp;
                t2=temp;
                temp=temp.next;

            }
        }
        t.next=dummy2.next;
        t2.next=null;
        return dummy.next;



        
    }
}