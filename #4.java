class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        int n=arr.size();
        if(n%2!=0){
            return arr.get(n/2);
        }else{
            return (arr.get(n/2)+arr.get(n/2-1))/2.00;
        }
        // return -1;
    }
}
