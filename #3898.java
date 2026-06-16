class Solution {
    public int[] findDegrees(int[][] matrix) {
        int index=0;
        int count=0;
        for(int[] x:matrix){
            count=0;
            for(int val:x){
                if(val==1){
                    count++;
                }
            }
            matrix[0][index++]=count;
        }
        return matrix[0];
    }
}
