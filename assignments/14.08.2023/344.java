class Solution {
    public void reverseString(char[] s) {
     
           recursive(s,0,s.length-1);
        
        }
        public static void recursive(char[]s,int first,int second){
            if(first>second){
                return;
            }
            else{
                
                char temp = s[first];
                s[first] = s[second];
                s[second] = temp;

                recursive(s,first+1,second-1);
            }
        }
       

    }
