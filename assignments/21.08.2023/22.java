class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans  = new ArrayList<>();
        generate("(",1,0,ans,n);
        return ans;

    }
    static void generate(String current, int o,int c,List<String>ans,int n){
        if(current.length()==2*n){
            ans.add(current);
            return;
        }
        if(o<n)generate(current+"(",o+1,c,ans,n);
        if(c<o)generate(current+")",o,c+1,ans,n);
    }
}