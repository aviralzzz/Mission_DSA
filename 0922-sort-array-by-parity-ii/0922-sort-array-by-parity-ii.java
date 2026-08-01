class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int n=nums.length;
        for(int ele:nums)
        {
            if(ele%2==0)
            even.add(ele);
            else
            odd.add(ele);
        }
        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
            nums[i]=even.get(j);
            j++;
            }
            else{
            nums[i]=odd.get(k);
            k++;
            }
        }
        return nums;
        
    }
}