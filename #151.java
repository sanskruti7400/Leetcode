class Solution {
    public String reverseWords(String s) {
        String[] rev=s.trim().split("\\s+");
        StringBuilder str=new StringBuilder();
        for(int i=rev.length-1;i>=0;i--){
            str.append(rev[i]);
            if(i!=0){
                str.append(" ");
            }
        }        
        return str.toString();
    }
}
