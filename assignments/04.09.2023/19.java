class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode trav = head;
        int count=0;
        int fina = 0;
       
        while(trav!=null){
          count++;
          trav = trav.next;
        }
      fina = count-n;
      if(count==1){
          return null;
      }
      ListNode current = head;
     if(fina==0){
         for(int i=1;i<count;i++){
             if(i==count-1){
                 current=current.next;
             }

         }
         return current;
     }
      
      for(int i =1;i<count;i++){
          if(i==fina){
             current.next = current.next.next;

          }
          current = current.next;
      }
      return head;
    }
}