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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeTwoLists(left,right);
    }
    ListNode getMiddle(ListNode node){
        if(node.next==null) return node;
        ListNode prev = null;
        ListNode slow = node;
        ListNode fast = node;
        while(fast!=null && fast.next!=null){
            prev  = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
            if(list1==null&&list2==null){
                return null;
                
            }
            else if(list1==null&&list2!=null){
                return list2;
            }
           else if(list1!=null&&list2==null){
            return list1;
           }
           else{
            if(list1.val<list2.val){
              list1.next=  mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
              list2.next=  mergeTwoLists(list1, list2.next);
                return list2;
            }
            
           }
        }
}