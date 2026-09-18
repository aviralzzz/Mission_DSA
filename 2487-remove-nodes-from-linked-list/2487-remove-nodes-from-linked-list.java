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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> st=new Stack<>();
        while(temp!=null)
        {
            if(st.isEmpty())
            {
                st.push(temp);
                temp=temp.next;
            }
            else
            {
                if(temp.val<st.peek().val)
                {
                    st.push(temp);
                    temp=temp.next;
                }
                else
                {
                    while(temp.val>st.peek().val )
                    {
                        st.pop();
                        if(st.isEmpty())
                        break;
                    }
                    st.push(temp);
                    temp=temp.next;
                }
            }
        }
        temp=null;
        while(!st.isEmpty())
        {
            ListNode a=st.pop();
            a.next=temp;
            temp=a;

        }
        return temp;
        
    }
}