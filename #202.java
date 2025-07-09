class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=square(n);
        }
        return n==1;
    }
    public int square(int n){
        int num=n,sum=0;
        while(n>0){
            num=n%10;
            n=(n/10);
            sum=sum+(num*num);
        }
        return sum;
    }
}
