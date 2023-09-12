class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack();
          Stack<Character> st2 = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();

                }
            }
        }
          for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            else{
                if(!st2.isEmpty()){
                    st2.pop();

                }
            }
        }
        
        while(!st.isEmpty()&&!st2.isEmpty()){
            if(st.peek()==st2.peek()){
                st.pop();
                st2.pop();
            }
            else{
                return false;
            }
        }
          if(st.isEmpty()&&st2.isEmpty()){
            return true;
        }
      
        return false;
    }
}