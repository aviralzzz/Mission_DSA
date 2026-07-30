class Solution {
    public int firstUniqueEven(int[] nums) {
        int ans=Integer.MAX_VALUE;
       int idx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int freq=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                if(nums[i]==nums[j])
                freq+=1;
                }
            }
            if(freq==0 && nums[i]%2==0)
            {
                idx=Math.min(idx,i);
                ans=Math.min(nums[idx],ans);
            }

        }
        if(ans==Integer.MAX_VALUE)
        return -1;
        else 
        return ans;
        
    }
}