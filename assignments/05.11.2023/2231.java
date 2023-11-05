class Solution {
    public int largestInteger(int num) {
          PriorityQueue<Integer> odd = new PriorityQueue<>();
        PriorityQueue<Integer> even = new PriorityQueue<>();
        int temp  = num;
        while(num>0){
            int cur = num%10;
            if(cur%2==0){
                 even.add(cur);
            }
            else{
                odd.add(cur);
            }
            num = num/10;
        }
        num =temp;
        LinkedList<Integer> l = new LinkedList();
         while(num>0){
               int cur = num%10;
            if(cur%2==0)
              l.addFirst(even.poll());
            else
               l.addFirst(odd.poll());
            num /= 10;
         }
         int ans= 0;
         for(int i=0;i<l.size();i++){
             ans = ans*10+l.get(i);
         }
         return ans;
    }
}