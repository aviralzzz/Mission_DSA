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
    public ListNode mergeKLists(ListNode[] arr) {
         if (arr == null || arr.length == 0) {
            return null;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        for (ListNode node : arr) {
            if (node != null) {
                list.add(node);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        while(list.size()>1)
        {
            ListNode a=list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            ListNode b=list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            ListNode c=merge(a,b);
            list.add(c);
        }
        ListNode ans=list.get(0);
        return ans;
        
    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                k.next=temp1;
                temp1=temp1.next;
                k=k.next;
            }
            else
            {
                k.next=temp2;
                temp2=temp2.next;
                k=k.next;
            }

        }
        if(temp1==null)
        k.next=temp2;
        else
        k.next=temp1;
        return dummy.next;
        
    }
}