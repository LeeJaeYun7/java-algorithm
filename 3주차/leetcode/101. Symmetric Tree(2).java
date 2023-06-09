// 다음과 같이, left, right 변수를 활용해서 문제를 해결할 수도 있다. 

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode left, TreeNode right){
        
        if(left == null && right == null){
            return true;
        }
        
        if(left == null || right == null){
            return false;
        }
        
        return left.val==right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left); 
        
        
    }
}
