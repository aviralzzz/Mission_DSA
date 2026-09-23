// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minSt;

//     public MinStack() {
//         st=new Stack<>();
//         minSt=new Stack<>();
        
//     }
    
//     public void push(int val) {
//         st.push(val);
//         if(minSt.size()==0 || minSt.peek()>val )
//         minSt.push(val);
//         else
//         minSt.push(minSt.peek());
        
//     }
    
//     public void pop() {
//         st.pop();
//         minSt.pop();
        
//     }
    
//     public int top() {
//         return  st.peek();
        
//     }
    
//     public int getMin() {
//         return minSt.peek();
        
//     }
// }
class MinStack {
    Stack<Long> st;
    long min;
    

    public MinStack() {
        st=new Stack<>();
        min=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.size()==0)
        min=(long)val;
        if(val>=min)
        {
            st.push((long)val);
        }
        else //fake value insert kro
        {
           
           st.push((long)val+((long)val-min)); 
            min=val;
        }
        
    }
    
    public void pop() {
        if(st.peek()<min)
        {
            min=min+(min-st.peek());
        }
        st.pop();
        
    }
    
    public int top() {
        long q=st.peek();
        if(q<min)
        {
            return (int)min;
        }
        else
        return (int)q;
        
    }
    
    public int getMin() {
        return (int)min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */