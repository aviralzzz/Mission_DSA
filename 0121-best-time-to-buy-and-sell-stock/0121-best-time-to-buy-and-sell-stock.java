class Solution {
    public int maxProfit(int[] nums) {
        // Edge case: if there are fewer than 2 days, no profit can be made
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int minPrice = nums[0];
        int maxProfit = 0;

        // Iterate through the array starting from the second day
        for (int i = 1; i < nums.length; i++) {
            // If we find a lower buying price, update minPrice
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            } else {
                // Otherwise, calculate the potential profit and update maxProfit
                int currentProfit = nums[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
