// 문제 접근 방법
// 1. Balanced tree의 의미를 정확히 이해한다면, isBalancedTree를 재귀적으로 넣어서 문제를 해결할 수 있다. 

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
    
    public int getHeight(TreeNode root){
        
        if(root == null){
            return -1; 
        }
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        return Math.max(left, right)+1; 
    }
    
    
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true; 
        }
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if(Math.abs(leftHeight-rightHeight) >= 2){
            return false;
        }
        
        return isBalanced(root.left) && isBalanced(root.right); 
    }
}
