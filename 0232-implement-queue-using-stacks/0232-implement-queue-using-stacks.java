class MyQueue {
    Stack<Integer> st;
    Stack<Integer> helper;
    public MyQueue() {
    st=new Stack<>();
    helper=new Stack<>();
    }
    public void push(int x) {
        st.push(x); 
    }
    
    public int pop() {
        while(st.size()>1)
        {
            helper.push(st.pop());
        }
        int a=st.pop();
        while(helper.size()>0)
        {
            st.push(helper.pop());
        }
        return a;
        
    } 
    public int peek() {
        while(st.size()>1)
        {
            helper.push(st.pop());
        }
        int a=st.peek();
        while(helper.size()>0)
        {
            st.push(helper.pop());
        }
        return a;
        
    }
    
    public boolean empty() {
        if(st.size()==0)
        return true;
        else 
        return false;
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