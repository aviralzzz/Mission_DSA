class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int ele:nums)
        {
            totalsum+=ele;
        }
        int leftsum=0;
        for(int i=0;i<n;i++)
        {
            totalsum=totalsum-nums[i];
            if(leftsum==totalsum)
            return i;
            leftsum+=nums[i];
        }
        return -1;

        }

}