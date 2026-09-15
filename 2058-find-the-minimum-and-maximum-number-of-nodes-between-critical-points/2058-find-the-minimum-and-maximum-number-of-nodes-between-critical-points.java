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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};
        int idx=1, firstIdx=-1,  lastIdx=-1;
        int minDistance=Integer.MAX_VALUE;
        ListNode a=head;
        ListNode b=a.next;
        ListNode c=b.next;
        if(c==null) //if  the size of the LL  is 2
        return ans;
        while(c!=null)
        { 
            //checking fo the critical points
            if((b.val>a.val && b.val>c.val)||(b.val<a.val && b.val<c.val))
            {
                if(firstIdx==-1)
                firstIdx=idx;

                if(lastIdx!=-1) //
                minDistance=Math.min(minDistance,idx-lastIdx);
                lastIdx=idx;
            }
            idx++;
            a=a.next;
            b=b.next;
            c=c.next;
        }  
        if (firstIdx != -1 && lastIdx != -1 && firstIdx != lastIdx) // firrst condition checks if  there has been no critical points and second confition checks for if one critical node  is  found
         {
            ans[0] = minDistance;
            ans[1] = lastIdx - firstIdx;
        } else {
            ans[0] = -1;
            ans[1] = -1;
        }
        return ans;
    }
}