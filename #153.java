class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        int min=nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                min=Math.min(min,nums[low++]);
            }else{
                min=Math.min(min,nums[high--]);
            }
        }
        return min;
    }
}
