class Solution {
     public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        sub(nums,list,ll,0);
        return ll;
    }

    private static void sub(int[] nums, List<Integer> list, List<List<Integer>> ll, int n) {
        if(nums.length==n){
            ll.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[n]);
        sub(nums, list, ll, n+1);
        list.remove(list.size()-1);
        sub(nums, list, ll, n+1);
    }
}