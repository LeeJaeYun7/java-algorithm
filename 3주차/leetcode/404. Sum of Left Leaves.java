// 문제 접근 방법
// 1. Left 노드가 null이 아니면서, leave(즉, root.left == null && root.right == null)일 때, 
//    sum 변수에 해당 노드의 val값을 더해주는 식으로 접근했다. 

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
    
    public int sum;
    
    
    public void getLeftSum(TreeNode root){
        
        if(root == null){
            return; 
        }
        
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }
        
        getLeftSum(root.left);
        getLeftSum(root.right); 
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
       
        sum = 0; 
        
        getLeftSum(root);
        
        return sum; 
    }
}
