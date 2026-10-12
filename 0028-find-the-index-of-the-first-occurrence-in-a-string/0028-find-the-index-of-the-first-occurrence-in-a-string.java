class Solution {
    public int strStr(String a, String b) {
        int n=a.length();
        int m=b.length();

        if (m > n) {
            return -1;
        }

        for(int i=0;i<=n-m;i++)
        {
                int c=i;
                int count=0;
                for(int j=0;j<m;j++)
                {
                    if(b.charAt(j)!=a.charAt(c))
                        break;
                    else
                    {
                        count++;
                        c++;
                    }
                } 
                if(count==m)
                return i;   
        }
          return -1;
    }
}