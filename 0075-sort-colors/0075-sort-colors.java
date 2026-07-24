class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            int min=Integer.MAX_VALUE;
            int mindx=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]<min)
                {
                    min=nums[j];
                    mindx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[mindx];
            nums[mindx]=temp;

        }
        
    }
}