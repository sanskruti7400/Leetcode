class Solution {
    public int maxProfit(int[] prices, int fee) {
        int b=-prices[0];
        int s=0;
        for(int i=1;i<prices.length;i++){
            b=Math.max(b,s-prices[i]);
            s=Math.max(s,b+prices[i]-fee);
        }
        return s;
    }
}
