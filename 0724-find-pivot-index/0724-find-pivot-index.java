class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int left=sum(nums,0,i);
            int right=sum(nums,i+1,n);
            if(left==right)
            return i;
        }
        return -1;
        }
        public int  sum(int[] nums,int start, int end)
        {
            int sum1=0;
            for(int i=start;i<end;i++)
            {
                sum1+=nums[i];

            }
            return sum1;
        }
       
}