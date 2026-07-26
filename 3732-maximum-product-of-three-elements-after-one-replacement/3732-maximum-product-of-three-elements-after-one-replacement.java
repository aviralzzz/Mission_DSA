class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long prod=(long)nums[n-1]*nums[n-2]*100000L;
        prod=Math.max(prod,(long)(nums[0]*-100000L * nums[n-1]));
        prod=Math.max(prod,(long)(nums[0]*nums[1]*100000L));
        return  prod;

    }
}