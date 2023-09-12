class MinStack {
    
      Stack<Integer> st = new Stack();
      Stack<Integer> min  = new Stack();
    public MinStack() {
        
    }
    
    public void push(int val) {
       st.push(val);
       if(st.isEmpty()){
           min.push(val);
       }
       else{
           if(min.peek()>=val){
               min.push(val);
           }
           else{
               min.push(min.peek());
           }
          
       }
    }
    
    public void pop() {
        if(!st.isEmpty()){
      
            min.pop();
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
     return min.peek();
    }
}