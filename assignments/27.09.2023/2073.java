class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
     
        for(int i=0;i<tickets.length;i++){
          if(tickets[i]<tickets[k]){
              time  = time+tickets[i];
          }
          else{
              time  = time+tickets[k];
          }
          if(i>k&&tickets[i]>=tickets[k]){
              time--;
          }
            }

        
        
        return time;
    }
}