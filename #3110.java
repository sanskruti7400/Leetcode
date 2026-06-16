class Solution {
    public int scoreOfString(String s) {
        char[] str=s.toCharArray();
        int sum=0;
        for(int i=0;i<str.length-1;i++){
            sum+=Math.abs(str[i]-str[i+1]);
        }
        return sum;
    }
}
