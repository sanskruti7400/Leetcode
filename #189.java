class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        int i=0;
        int j=n-1;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int nums[],int i,int j){
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
}
}
