// 문제 접근 방법
// 1. ArrayList<Integer> arr을 선언하고, 모든 수들을 넣어준 다음에, 정렬하는 방식으로 접근했다.
// -> 모든 수를 넣기 위해서, 트리를 전위순회로 순회하면서 값을 넣어줬다. 

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
    
    ArrayList<Integer> arr;
    
    public void preorder(TreeNode root){
        
        if(root == null){
            return;
        }
        
        arr.add(root.val);
        preorder(root.left);
        preorder(root.right); 
        
    }
    
    
    public int minDiffInBST(TreeNode root) {
        arr = new ArrayList<>();
        
        preorder(root);
        
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        
        for(int i=1; i<arr.size(); i++){
            minDiff = Math.min(minDiff, arr.get(i)-arr.get(i-1));
        }
        
        return minDiff; 
        
        
    }
}
