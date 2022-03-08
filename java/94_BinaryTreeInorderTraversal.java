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
    //left, root, right
    public void helper(TreeNode root,  List<Integer>  result){
        if(root == null)
            return; 
        if(root.left != null)
            helper(root.left, result);
        result.add(root.val);
        if(root.right != null)
            helper(root.right, result);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> AA = new ArrayList<Integer>();
        /*helper(root, AA);
        return AA;*/
        Stack<TreeNode> q = new Stack<>(TreeNode);
        while(!q.empty()){
            TreeNode cur = q.pop();
            AA.add(cur.val);
            if(cur.left != NULL){
                q.push(cur.left);
            }
            if(cur.right !- NULL){
                q.push(cur)
            }
        }
         
    }
}
