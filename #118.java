class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> res = new ArrayList<>();
            res.add(1);
            for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                res.add(val);
            }
            if(i>0){
                res.add(1);
            }
            ans.add(res);
        }
        return ans;
    }
}
