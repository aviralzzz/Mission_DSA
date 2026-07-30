class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            count=count+(i/8)+1;
        }
        return count;
    }
}