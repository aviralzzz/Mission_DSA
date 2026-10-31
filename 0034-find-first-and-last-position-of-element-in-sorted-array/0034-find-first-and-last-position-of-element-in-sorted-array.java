class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ans[0]=findfirst(nums,target);
        ans[1]=findlast(nums,target);
        return ans;
    }
         int  findfirst(int[] nums,int target)
        {
            int index=-1;
            int low=0;
            int high=nums.length-1;

            while(low<=high)
            {
                int mid=low+(high-low)/2;

                if(nums[mid]>=target)
                high=mid-1;
                else
                low=mid+1;

                if(nums[mid]==target)
                index=mid;
            }
            return index;
        }

         int  findlast(int[] nums,int target)
        {
            int index=-1;
            int low=0;
            int high=nums.length-1;

            while(low<=high)
            {
                int mid=low+(high-low)/2;

                if(nums[mid]<=target)
                low=mid+1;
                else
                high=mid-1;

                if(nums[mid]==target)
                index=mid;
            }
            return index;
        }
        
    }
