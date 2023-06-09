// 문제 접근 방법
// 1. 이 문제는 Tree가 대칭인지 확인하는 문제이다
// 2. 처음에는 Tree를 left, right를 바꿔서, 이전 트리와 이후 트리가 일치하는지 확인했다.
// 3. 이러한 방법의 문제점은 Tree의 노드가 참조형 변수이므로, left와 right를 바꾸면서, 이전 트리도 같이 바뀐다는 점이 문제이다
// 4. 따라서 이러한 문제를 해결하기 위해 이전 트리의 정보를 before ArrayList에 저장하고,
//    그걸 좌우를 뒤집어 준 이후에, 이후 트리의 정보를 after ArrayList에 저장한 후에, 
//    그 두 ArrayList를 비교해주는 방식으로 문제를 해결했다.
// 5. 두 ArrayList를 비교할 때, 각각의 값을 int값으로 받아서 비교해줘야 한다. 

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
    
    ArrayList<Integer> before;
    ArrayList<Integer> after; 
    
    public TreeNode getDecalco(TreeNode root){
        
        if(root == null){
            return null;
        }
        
        TreeNode left = getDecalco(root.left);
        TreeNode right = getDecalco(root.right);
        
        root.left = right;
        root.right = left;
        
        return root; 
        
    }
    
    
    
    
    public void preOrder(TreeNode root, int num){
        
        if(root == null){
            if(num == -1){
                before.add(1000);
            }else if(num == 1){
                after.add(1000);
            }
            return; 
        }
        
        if(num == -1){
            before.add(root.val);
        }else if(num == 1){
            after.add(root.val); 
        }
        preOrder(root.left, num);
        preOrder(root.right, num); 
    }
    
    
    
    public boolean isSymmetric(TreeNode root) {
        
        boolean res = true; 
        
        before = new ArrayList<>();
        after = new ArrayList<>(); 
        
        preOrder(root, -1);
        getDecalco(root);
        preOrder(root, 1);
        
        for(int i=0; i<before.size(); i++){
            int num1 = before.get(i);
            int num2 = after.get(i);
            if(num1 != num2){
                res = false;
                break; 
            }
        }
        
        
        return res; 
        
    }
}
