//first method
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i : nums){
            if(i!=0){
                nums[k++]=i;
            }
        }
        while(k<nums.length){
            nums[k++]=0;
        }
    }
}



//second method 
class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp=new int[nums.length];
        int k=0;
        for(int num : nums){
            if(num!=0){
                temp[k++]=num;
            }
        }
        while(k<nums.length){
            temp[k++]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}
