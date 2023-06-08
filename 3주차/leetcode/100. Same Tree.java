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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
           // p, q 둘 다 유효한 노드일 때, 
           if(p != null && q != null){
               // p와 q의 값이 다르면 
               if(p.val != q.val){
                   return false;
               }
           }
           // p, q중 q만 null일 때, 
           else if(p != null && q == null){
               return false;
           }
           // p, q중 p만 null일 때, 
           else if(p == null && q != null){
               return false;
           }
           // p, q 둘 다 null일 때,
           else{
               return true;
           }
        
           // 왼쪽 서브트리의 결과 저장
           boolean left = isSameTree(p.left, q.left);
           // 오른쪽 서브트리의 결과 저장 
           boolean right = isSameTree(p.right, q.right);
        
           // 둘 중 하나라도 false가 있다면, false 반환
           // 아닌 경우는 true 반환 
           return left && right;
        
        
    }
}
