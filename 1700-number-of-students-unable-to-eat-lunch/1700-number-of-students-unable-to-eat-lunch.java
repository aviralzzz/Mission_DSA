class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=sandwiches.length;
        int m=students.length;
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=n-1;i>=0;i--)
        {
            st.push(sandwiches[i]);
        }
        for(int i=0;i<m;i++)
        {
            q.add(students[i]);
        }
        int count=0;
        while(q.size()>0 && count<q.size())
        {
            if(q.peek()==st.peek())
            {
                q.remove();
                st.pop();
                count=0;
            }
            else{
                q.add(q.remove());
                count++;
            }
        }
        return q.size();
               
    }
}