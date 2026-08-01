class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        int count=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>pivot)
            {
                list1.add(nums[i]);
            }
            else if(nums[i]<pivot)
            {
                list2.add(nums[i]);
            }
            else
            count++;
        }
        for(int i=0;i<list2.size();i++)
        {
            nums[i]=list2.get(i);

        }

        for(int i=list2.size();i<(list2.size()+count);i++)
        {
            nums[i]=pivot;
        }
        int k=0;

        for(int j=list2.size()+count;j<nums.length;j++)
        {
            nums[j]=list1.get(k);
            k++;

        }
        return nums;

        
    }
}