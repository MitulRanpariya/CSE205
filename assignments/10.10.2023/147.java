/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode curr = head;
        ListNode next = curr;
        ListNode node = dummy;
        while(curr!=null){      
            next  = curr.next;        
            while(node.next!=null && node.next.val<curr.val){
                node = node.next;
            }      
            curr.next = node.next;
            node.next = curr;
            node = dummy;
            curr = next;
        }
        return dummy.next;
    }
}