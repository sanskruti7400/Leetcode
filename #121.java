class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int p=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            p=Math.min(p,prices[i]);
            max=Math.max(max,prices[i]-p);
        }
        
        return max;
    }
}
