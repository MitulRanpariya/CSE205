class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
     Arrays.sort(arr);
        List<List<Integer>> list  = new ArrayList();
        int  def =Integer.MAX_VALUE;
        for(int i =0;i<arr.length-1;i++){
            if(def>arr[i+1]-arr[i]){
                def = arr[i+1]  -arr[i];
            }
        }
        for(int i=0;i<arr.length-1;i++){
            List<Integer> l = new ArrayList();
            l.add(arr[i]);
            l.add(arr[i+1]);
            if(def==arr[i+1]-arr[i]){
                list.add(l);
            }
            
        }
        return list;
    }
}