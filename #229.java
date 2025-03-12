class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int numslen=nums.length;
        List<Integer> result=new ArrayList<>();
        Set<Integer> seen=new HashSet<>();
        int count=1;
        int c=numslen/3;
        for(int i=numslen-1;i>=0;i--){
            count=1;
            if(seen.contains(nums[i]))continue;
            for(int j=i-1;j>=0;j--){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            
            if(count>c){
                result.add(nums[i]);
                seen.add(nums[i]);
            }
        }
        return result;
    }
}
