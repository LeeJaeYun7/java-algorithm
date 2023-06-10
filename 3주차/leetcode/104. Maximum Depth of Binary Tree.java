// 문제 접근
// 1. Leaf node일 때, 즉, root.left == null && root.right == null 일 때의 height를 구하고,
//    그것이 maxHeight인지 판단해주는 접근법을 취한다. 

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
    
    public int maxHeight;
    
    public void preorder(TreeNode root, int height){
        
        if(root == null){
            return; 
        }
        
        if(root.left == null && root.right == null){
            maxHeight = Math.max(maxHeight, height);
            return; 
        }
        
        preorder(root.left, height+1);
        preorder(root.right, height+1);
        
    }
    
    
    public int maxDepth(TreeNode root) {
        
        maxHeight = 0;  
        
        preorder(root, 1);
        
        return maxHeight; 
    }
}
