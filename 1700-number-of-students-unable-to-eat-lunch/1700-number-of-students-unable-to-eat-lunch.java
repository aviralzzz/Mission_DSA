class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int m=students.length;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            q.add(students[i]);
        }
        int count=0;
        int sidx=0;
        while(q.size()>0 && count<q.size())
        {
            if(q.peek()==sandwiches[sidx])
            {
                q.remove();
                sidx++;
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