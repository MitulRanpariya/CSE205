class Solution {
    public void deleteNode(ListNode node) {
       ListNode current  = node.next;
      while(current!=null){
          if(current.next==null){
            return;
          }
          node.val = current.next.val;
          current = current.next;
      }
       
    }
}