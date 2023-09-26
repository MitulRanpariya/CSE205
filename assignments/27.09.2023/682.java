class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack();
        for(String str:operations){
            if(str.equals("+")){
                if(s.size()>=2){
                      s.push(s.get(s.size()-1)+s.get(s.size()-2));
                }
            }
            else if(str.equals("C")){
                if(!s.isEmpty()){
                s.pop();
                }
            }
            else if(str.equals("D")){
                s.push(2*s.peek());
            }
            else{
                
                s.push(Integer.parseInt(str));
            }
        }
        int result =0;
        while(!s.isEmpty()){
            result = result+s.pop();
           
        }
        return result;
    }
}