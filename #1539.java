class Solution {
    public int findKthPositive(int[] arr, int k) {
       int n=1,m=0,miss=0;
       while(miss<k){
        if(m<arr.length && arr[m]==n){
            m++;
        }else{
            miss++;
            if(miss==k){
                return n;
            }
        }
        n++;
       }
       return -1;
    }
}
