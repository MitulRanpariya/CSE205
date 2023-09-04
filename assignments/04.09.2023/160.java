public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode current ;
        while(headB!=null){
            current = headA;
            while(current!=null){
            if(current.val == headB.val){
                 
                 if(current==headB){
                     return current;
                 }
            }
            current = current.next;

        }
        headB=headB.next;
        }
      
        return null;
    }
}