class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int s=1;
       
        int fr=0;
        int fc=0;
        int lr=n-1;
        int lc=n-1;
        while(fc<=lc && fr<=lr)
        {
            for(int i=fc;i<=lc;i++)
            {
                matrix[fr][i]=s;
                s++;
            }
            fr++;
            for(int i=fr;i<=lr;i++)
            {
                matrix[i][lc]=s;
                s++;
                
            }
            lc--;
            if(fr>lr)
            {
                break;
            }
            for(int i=lc;i>=fc;i--)
            {
                matrix[lr][i]=s;
                s++;
            }
            lr--;
            if(fc>lc)
            {
                break;
            }
           
            for(int i=lr;i>=fr;i--)
            {
                matrix[i][fc]=s;
                s++;
                
            }
            fc++;
            
        }
       
        return matrix;
        
    }
}