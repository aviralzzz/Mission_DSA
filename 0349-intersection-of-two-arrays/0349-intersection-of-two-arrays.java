class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int ele:nums1)
        {
            a.add(ele);

        }
        for(int ele:nums2)
        {
            if(a.contains(ele))
            {
                result.add(ele);
            }

        }
        int n=result.size();
        int[] ans=new int[n];
        int i=0;
        for(int ele:result)
        {
            ans[i]=ele;
            i++;
        }
        return ans;

    }
}