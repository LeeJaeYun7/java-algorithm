// 문제 접근 방법
// 1. Path에 해당하는 sum들을 더해나가다가, Leaf에 도달했을 때, targetSum과 같은지 체크한다
// 2. root가 null일 때, return하는 조건을 추가해야 한다. 

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
    
    public int target; 
    public boolean isExist; 
    
    public void getSum(TreeNode root, int sum){
        
        if(root == null){
            return; 
        }
        
        sum += root.val;
        
        if(root.left == null && root.right == null){
            if(sum == target){
                isExist = true;
            }
            return; 
        }
        
        
        getSum(root.left, sum);
        getSum(root.right, sum); 
        
    }
    
    
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
          if(root == null){
              return false; 
          }
        
          isExist = false;
          target = targetSum; 
           
          getSum(root, 0);
        
          return isExist; 
    }
}
