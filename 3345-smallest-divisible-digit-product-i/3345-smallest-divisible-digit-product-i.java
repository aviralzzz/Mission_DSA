class Solution {
    public int smallestNumber(int n, int t) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<10;i++)
        {
            int p=prod(n);
            if(p%t==0)
            return n;
            else
            n++;
        }
      return 0;
        
    }
    public int prod(int n)
    {
        int p=1;
        while(n!=0)
        {
            int r=n%10;
            p=p*r;
            n=n/10;
        }
        return p;
    }
}