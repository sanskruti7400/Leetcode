class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         if (k == 0 || nums == null || nums.length <= 1) {
            return false;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j <= i + k && j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if((j-i)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}