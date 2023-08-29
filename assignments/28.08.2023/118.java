class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList();
        List<List<Integer>>result = new ArrayList();
        for(int i=1;i<=numRows;i++){
            List<Integer>l1 = new ArrayList();
            for(int j=0;j<i;j++){
                if(j==0||j==i-1){
                    l1.add(1);
                }
                else{
                    l1.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
            result.add(l1);
        }
        return result;
    }
}