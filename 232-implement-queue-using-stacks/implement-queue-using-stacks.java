class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MyQueue() {
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public int pop() {
        while(st.size()>1){
            helper.add(st.pop());
        }
        int val=st.pop();
        while(!helper.isEmpty()){
            st.add(helper.pop());
        }
        return val;
    }
    
    public int peek() {
        while(st.size()>1){
            helper.add(st.pop());
        }
        int val=st.pop();
         st.add(val);
         while (!helper.isEmpty()) {
            st.add(helper.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */