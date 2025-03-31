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
//wihtout hashmap 

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length==1){
            res.add(nums[0]);
            return res;
        }
        for(int i=0;i<nums.length;i++){
            int len=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    len++;
                }
            }
            if(nums.length/3<len){
                if(!res.contains(nums[i])){
                    res.add(nums[i]);
                }
            }
        }
        return res;
    }
}
