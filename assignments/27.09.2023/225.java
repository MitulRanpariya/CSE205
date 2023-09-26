class MyStack {
      Queue<Integer> s1 = new LinkedList();
      Queue<Integer> s2 = new LinkedList();
    public MyStack() {
        
    }
    
    public void push(int x) {
        s2.add(x);
        while(!s1.isEmpty()){
            s2.add(s1.remove());
        }
        Queue<Integer> s = s1;
        s1 = s2;
        s2 = s;

    }
    
    public int pop() {
  
    return s1.remove();
       
    }
    
    public int top() {
       if (s1.isEmpty())
                return -1;
            return s1.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty()&&s2.isEmpty()){
            return true;
        }
        return false;
    }
}

