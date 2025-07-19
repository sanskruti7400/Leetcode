class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        while(low%2==0){
            low++;
        }
        while(high%2==0){
            high--;
        }
        count=(high-low)/2+1;
        return count;
    }
}
