class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            list.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        for(int i=min;i<=max;i++)
        {
            if(!list.contains(i))
            {
                ans.add(i);
            }

        }
        return ans;

        
    }
}