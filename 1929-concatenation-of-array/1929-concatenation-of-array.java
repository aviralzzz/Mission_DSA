class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
        }
        int k=0;
        for(int j=n;j<ans.length;j++)
        {
            ans[j]=nums[k];
            k++;
        }
        return ans;
        
    }
}