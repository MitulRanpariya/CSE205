class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean [] mark = new boolean[nums.length];
        recur(nums,l,ans,mark);
        return ans;

    }
    static void recur(int [] nums,List<Integer>l ,List<List<Integer>>ans,boolean []mark){
        if(nums.length==l.size()) {
            ans.add(new ArrayList(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!mark[i]){
                mark[i] = true;
                l.add(nums[i]);
                recur(nums,l,ans,mark);
                l.remove(l.size()-1);
                mark[i] = false;


            }
        }
    }
}