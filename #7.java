class Solution {
    public int reverse(int x) {
        int n=0,r,s=0;
        while(x!=0){
            r=x%10;
            if (s > Integer.MAX_VALUE/10 || s < Integer.MIN_VALUE/10) {
                return 0;
            }
            s=s*10+r;
            x=x/10; 
        }
        return s;
    }
}
