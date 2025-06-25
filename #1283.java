class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);

        while (low < high) {
            int mid = (low + high) / 2;
            int sum = getSum(nums, mid);

            if (sum <= threshold) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }

    private int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }
}
