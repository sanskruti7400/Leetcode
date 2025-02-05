class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            int k=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    k++;
                }
            }
            if((nums.length)/2<k){
                return nums[i];
            }
        }
        return -1;
    }
}