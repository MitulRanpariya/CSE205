class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
           str.append(st.pop());
          
        }
     return str.reverse().toString();
    }
}