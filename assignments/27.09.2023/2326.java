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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix =new int[m][n];
        int l = 0, r = n-1, t =0, b= m-1, d =0 ;
        while(l<=r&&t<=b){
            if(d==0){
              for(int i=l;i<=r;i++){
                  if(head==null){
                       matrix[t][i] = -1;
                  }
                 else{matrix[t][i] = head.val;
                 head = head.next;
                 }
              }

                d =1;t++;
            }
           else if(d==1){
                  for(int i=t;i<=b;i++){
                  if(head==null){
                       matrix[i][r] = -1;
                  }
                 else{ 
                     matrix[i][r] = head.val;
                     head = head.next;
                 }

              }
              d=2;r--;

            }
            else if(d==2){
             for(int i=r;i>=l;i--){
                   if(head==null){
                       matrix[b][i] = -1;
                  }
                 else{ 
                     matrix[b][i] = head.val;
                     head = head.next;
                 }
             }
 
          d = 3;b--;
        }
            else if(d==3){
                  for(int i=b;i>=t;i--){
                   if(head==null){
                       matrix[i][l] = -1;
                  }
                 else{ 
                     matrix[i][l] = head.val;
                     head = head.next;
                 }
             }

              d=0;l++;

            }

        }
        return matrix;
    }
}