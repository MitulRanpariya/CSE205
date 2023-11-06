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
class BSTIterator {
     List<Integer> l = new ArrayList();
     int i=0;
     TreeNode root = new TreeNode();
    public BSTIterator(TreeNode root) {
        this.root = root;
       inorder(root);
    }
    
    public int next() {
        if(hasNext()){
           return l.get(i++);
        }
        return 0;
    }
    
    public boolean hasNext() {
        if(i==l.size())return false;;
        return true;
    }
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */