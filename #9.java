class Solution {
    public boolean isPalindrome(int x) {
        int n=0,r,s=0;
        n=x;
        while(x!=0){
            r=x%10;
            s=s*10+r;
            x=x/10; 
        }
       if(n>=0){
        if(s==n){
            return true;
        }
       }
        return false;
    }
}
