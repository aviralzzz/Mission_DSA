class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums)
        {
            set.add(ele);
        }
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
        
    }
}