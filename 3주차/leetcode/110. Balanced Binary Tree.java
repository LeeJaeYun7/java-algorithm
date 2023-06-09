// 시간 복잡도: O(logN)

// 문제 접근 방법
// 1. 왼쪽과 오른쪽의 높이를 구하고, 그 중 높은 값에 +1을 하는 방식으로 높이를 구한다
// 2. 이 때, 각 단계에서 왼쪽과 오른쪽의 높이 차를 계산하여, 2이상이면 balanced가 아닌 것으로 판단한다
// 3. 이 과정을 매 재귀단계마다 적용해야 한다는 것이 중요한 포인트이다. 

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
    
    public boolean result; 
    
    public int getHeight(TreeNode root){
        
        if(root == null){
            return -1; 
        }
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left-right) >= 2){
            result = false; 
        }
        
        return Math.max(left, right)+1; 
    }
    
    
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true; 
        }
        
        result = true; 
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if(Math.abs(leftHeight-rightHeight) >= 2){
            result = false;
        }
        
        return result; 
    }
}
