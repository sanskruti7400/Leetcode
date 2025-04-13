class Solution {
    public int maxProduct(int[] nums) {
       if (nums.length == 0) return 0;
        
        int maxP = nums[0];
        int minP = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxP * nums[i], minP * nums[i]));
            minP = Math.min(nums[i], Math.min(maxP * nums[i], minP * nums[i]));
            maxP = tempMax;

            res = Math.max(res, maxP);
        }

        return res;
    }
}
