class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=-1;
        
        for(int i=0;i<n-1;i++)
        {
            
            max=Math.max(max,Math.abs((nums[i]-nums[i+1])));
            
        }
        if(max==-1)
        return 0;
        return max;
        
    }
}