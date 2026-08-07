/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=0;
        int sizeB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null)
        {
            tempA=tempA.next;
            sizeA++;
        }
        while(tempB!=null)
        {
            tempB=tempB.next;
            sizeB++;
        }
         tempA=headA;
        tempB=headB;
        int diff=Math.abs(sizeA-sizeB);

       
        
        if(sizeA>sizeB)
        {
        for(int i=1;i<=diff;i++)
        {
            tempA=tempA.next;
            
        }
        }
        else
        {
            for(int i=1;i<=diff;i++)
        {
            tempB=tempB.next;
            
        }
        }
        while(tempA!=tempB)
        {
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;

    }
}