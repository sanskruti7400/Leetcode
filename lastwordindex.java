class Solution {
    public int lengthOfLastWord(String s) {
        int i=0;
        i=s.length()-1;
        int j=0;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            j++;
            i--;
        }
        return j;
    }
}