class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                if(ans.isEmpty() || ans.get(ans.size()-1)!=nums1[i])
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        int n=ans.size();
        int[] anss=new int[n];
        for(int k=0;k<n;k++)
        {
            anss[k]=ans.get(k);
        }
        return anss;

    }
}