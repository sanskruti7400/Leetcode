class Solution {
    public int fib(int n) {
        int n1=0,n2=1;
        if(n==0)return 0;
        for(int i=1;i<n;i++){
            int sum=0;
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        return n2;
    }
}
