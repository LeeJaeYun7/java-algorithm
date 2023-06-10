// 문제 접근 방법
// 1. ArrayList<Integer> arr을 만들고, preOrder 메소드를 만들어서, 매개변수로 전달했다.
// -> 매개변수로 전달하고, preOrder 메소드로 순회하면서 값을 넣어줬다. 


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
    
    public void preOrder(TreeNode root, ArrayList<Integer> arr){
        
        if(root == null){
            return; 
        }
        
        arr.add(root.val);
        preOrder(root.left, arr);
        preOrder(root.right, arr); 
        
    }
    
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        preOrder(root, arr);
        
        return arr; 
        
    }
}
