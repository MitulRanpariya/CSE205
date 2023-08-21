class Solution {
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result  = new ArrayList<>();
         sumcom(candidates, 0, target, new ArrayList<>(), result);
         return result;
        
    }
    static void sumcom(int [] arr,int i,int target,List<Integer>l,List<List<Integer>>result){
               
        if(arr.length == i){
            if(target==0){
                result.add(new ArrayList<>(l));
            }
            return;
        }

        if(arr[i]<=target){
            l.add(arr[i]);
            sumcom(arr,i,target-arr[i],l,result);   
            l.remove(l.size()-1);          
        }
        sumcom(arr, i+1, target, l, result);
        
    }

}