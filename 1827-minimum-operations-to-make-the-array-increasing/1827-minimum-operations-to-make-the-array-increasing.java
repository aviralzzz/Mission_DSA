class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n==1)
        return 0;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1]){
                count=count+1;
                nums[i+1]+=1;
            }
            else if(nums[i]>nums[i+1])
            {
                int diff=0;
                diff=nums[i]-nums[i+1];
                count+=diff+1;
                nums[i+1]+=diff+1;
            }
    
        }
        return count;
        
    }
}