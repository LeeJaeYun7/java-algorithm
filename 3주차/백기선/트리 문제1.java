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
    
    public static void print(Node root, int index){
        
        if(root == null){
            return; 
        }
        
        print(root.left, index);
        print(root.right, index);
        cnt++;
        if(cnt == index){
            System.out.println(root.val); 
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
        
        print(root, 5);
      
      
    }
    
    
    
    
}
