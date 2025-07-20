class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int c=(int)ch;
            if((48<=c && c<=57)|| (65<=c && c<=90) || (97<=c && c<=122)){
                if(65<=c && c<=90){
                    ch=(char)(ch+32);
                }
                rev.append(ch);
            }
        }
        String r=rev.toString();
        String reverse=new StringBuilder(r).reverse().toString();
        if(reverse.equals(r)){
            return true;
        }
        return false;
    }
}
