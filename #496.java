class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int n:nums2){
            while(! stack.isEmpty() && stack.peek()< n){
                map.put(stack.pop(),n);
            }
            stack.push(n);
        }
        int[] arr= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=map.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}
