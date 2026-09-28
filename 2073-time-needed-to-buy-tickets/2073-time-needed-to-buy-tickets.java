class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int time=0;
        Queue<Integer> q=new LinkedList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            q.add(i);
        }
        while(arr[k]!=0)
        {
            if(arr[q.peek()]==0)
            q.remove();
            else
            {
                arr[q.peek()]--;
                time++;
                q.add(q.remove());
            }
        }
        return time;

        
    }
}