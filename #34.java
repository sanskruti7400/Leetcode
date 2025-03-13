class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        if(nums.length==0){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int i,k=0;
        for(i=0;i<nums.length;i++){
            if(target==nums[i]){
                k=i;
                break;
            }else{
                k=-1;
            }
        } 
        res[0]=k;
        for(int j=i;j<nums.length;j++){
            if(target==nums[j]){
                k=j;
            }
        } 
        res[1]=k;
        return res;
    }
}
