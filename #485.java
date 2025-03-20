class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0;
        int maxc=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                if (count > maxc) { 
                    maxc = count;
                }
            }else{
                count=0;
            }
            i++;
        }
        return maxc;
    }
}
