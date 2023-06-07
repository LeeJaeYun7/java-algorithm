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
    
    public List<Integer> answer; 
    
    public void recursive(TreeNode root){
        
        if(root == null){
            return; 
        }
        
        recursive(root.left);
        answer.add(root.val);
        recursive(root.right); 
        
    }
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        answer = new ArrayList<>();
        recursive(root);
        
        return answer; 
        
    }
}
