class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        HashSet<Integer> ans=new HashSet<>();
        for(int ele:nums)
        {
            ans.add(ele);
        }
        for(int i=0;i<=n;i++)
        {
            if(!ans.contains(i))
            return i;
        }
        return -1;
    }
}