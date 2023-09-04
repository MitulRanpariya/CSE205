class Solution {
    public ListNode middleNode(ListNode head) {
        
        
   ListNode current  = head;
     ListNode second =  head.next;
     while(second.next!=null){
         second  = second.next;
         current = current.next;
     }
     return current;
    }
}