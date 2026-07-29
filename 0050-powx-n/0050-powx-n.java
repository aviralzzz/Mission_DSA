class Solution {
    public double Pow(double x, int n) {
        if(n==0)
        return 1.0;
        double half=Pow(x,n/2);
        if(n%2==0)
        return half*half;
        else
        return x*half*half;
        
    }
    public double myPow(double x, int n) {
        if(n<0)
        {
            x=1/x;
            n=-n;
        }
        double ans=Pow(x,n);
        return ans;
        
        
    }
}