import java.util.*; 
import java.io.*; 

class Node{
    
    int val; 
    Node left;
    Node right;
    
    public Node(int val){
        this.val = val; 
    }
    
}



public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int cnt = 0;
    public static int maxHeight = Integer.MIN_VALUE; 
    
    public static void print(Node root, int height){
        
        if(root == null){
            maxHeight = Math.max(maxHeight, height-1); 
            return; 
        }
        
        print(root.left, height+1);
        print(root.right, height+1);
        
    }
    
    
    public static int getHeight(Node root){
        
        if(root == null){
            return 0; 
        }
        
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if(leftHeight > rightHeight){
            return leftHeight+1;
        }else{
            return rightHeight+1; 
        }
        
        
        
    }
    
    
    
    public static void main(String args[]) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        print(root, 1);
        
        
        System.out.println(maxHeight); 
        
        System.out.println(getHeight(root));
      
    }
    
    
    
    
}
