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
    
    // inorder 순회, 즉, 중위순회는
    // 왼쪽, 현재 노드, 오른쪽 순으로 순회한다
    // 따라서, 왼쪽 노드부터 재귀로 타면서 검색을 하고,
    // 그 다음에 현재 노드의 값을 answer에 더해주고,
    // 그 다음 오른쪽 노드를 재귀로 타면서 검색한다 
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
