class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<Character>();

        for(char c : s.toCharArray()){
            if(! stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder s1=new StringBuilder();
        for(char c : stack){
            s1.append(c);
        }
        return s1.toString();
    }
}
