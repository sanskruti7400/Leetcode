class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int l = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                if(l > 0){
                    str = str + c;
                }
                l++;
            } else {
                l--;
                if(l > 0){
                    str = str + c;
                }
            }
        }
        return str;
    }
}
