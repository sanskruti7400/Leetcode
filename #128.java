class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1,k=1,maxcount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    count++;
                }else{
                    count=1;
                }
                maxcount=Math.max(maxcount,count);
            }
        }
        return maxcount;
    }
}
