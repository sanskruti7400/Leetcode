class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        ans[0]=nums[0];
        int sum=nums[0];
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i+1];
            ans[i+1]=sum;
        }
        return ans;
    }
}
