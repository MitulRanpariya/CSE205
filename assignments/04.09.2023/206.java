class Solution {
    public ListNode reverseList(ListNode head) {
      
        if(head==null||head.next==null){
            return head;
        }
        ListNode revehead = reverseList(head.next);
        ListNode temp = head.next;
        temp.next=head;
        head.next = null;
        return revehead;
      
    }
}