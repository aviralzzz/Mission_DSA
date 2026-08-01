class Solution {
    public int reverse(int x) {
        int n=x;
        long rev=0; //jab rev*10 hoga toh number integer limit ke baahar  chala jayega
        while(x!=0)
        {
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
        return 0;
        if(x<0)
        return (int)rev*-1;
        return (int)rev;
        
    }
}