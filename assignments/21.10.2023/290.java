class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap();
        HashSet<String> set = new HashSet();
        String[] arr=s.split(" ");
        int i =0;
        boolean flag = true;
       
        if(arr.length!=pattern.length()){
            return false;
        }
        for(String str : s.split(" ")){
            set.add(str);
            
            if(!hm.containsKey(pattern.charAt(i))){
                hm.put(pattern.charAt(i),str);
                i++;
            }
            else{
                if(!hm.get(pattern.charAt(i)).equals(str) ){
                return false;
                }
                i++;
            }
           
           
        }
        if(hm.size()!=set.size()){
            return false;
        }
         
        return flag;
    }
}