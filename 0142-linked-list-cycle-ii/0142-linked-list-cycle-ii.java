/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean a=false;
        while(fast!=null && fast.next!=null)
        {
            
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
            a=true;
            break;}
        }
        ListNode t=head;
        while(a)
        {
            
            if(t==slow)
            {
                return t;
            }
            t=t.next;
            slow=slow.next;
        }
        return null;

    }
}