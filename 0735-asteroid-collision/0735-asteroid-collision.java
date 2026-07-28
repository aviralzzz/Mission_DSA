class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                st.push(arr[i]);
            }
            else
            {
                while(st.size()>0 && st.peek()>0 && st.peek()<Math.abs(arr[i]))
                {
                    st.pop();
                }
                if(st.size()>0 && st.peek()==Math.abs(arr[i]))
                {
                    st.pop();
                }
                else if(st.size()==0 || st.peek()<0)
                {
                    st.push(arr[i]);
                }
            }
        } 
        int a=st.size();
        int[] ans=new int[a];
        for(int i=a-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
        
    }
}