class MinStack {

    Stack<Integer> Stack;
    Stack<Integer> minStack;

    public MinStack() {
        Stack = new Stack<>();
        minStack = new Stack<>();        //Initialized objects
    }
    
    public void push(int val) {
        Stack.push(val);

        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);                                 // if minstack is empty or the val less than the top ele in minstack then push that value in minstack
        }else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        if(!Stack.isEmpty()){
            Stack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return Stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    } 
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
