class Solution {
    public int maxProduct(int n) {
        int max=0;
        int temp=n;
        int count=0;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        int[] arr=new int[count];
        for(int i=count-1;i>=0;i--)
        {
            arr[i]=n%10;
            n=n/10;
        }
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
            int prod=arr[i]*arr[j];
            max=Math.max(max,prod);
            }
        }
        return max;
        
    }
}