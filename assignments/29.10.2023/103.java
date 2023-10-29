/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if(root==null) return list;
        q.add(root);
       boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            LinkedList<Integer> l = new LinkedList();
            while(size-->0){
               TreeNode temp = q.remove();
                   if(flag){
                      l.add(temp.val);
                   }
                   else{
                       l.addFirst(temp.val);
                   }
                  
                
                 if(temp.left!=null){
                     q.add(temp.left);
                 }
                 if(temp.right!=null){
                     q.add(temp.right);
                 }
            }
            list.add(l);
         flag = !flag;
        }  
        return list;
    }
}