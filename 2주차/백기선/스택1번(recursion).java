import java.util.*; 

public class Main {
    
    
    public static void insertAtBottom(Stack<Integer> stk, int num){
        
        if(stk.isEmpty()){
            stk.push(num);
            return; 
        }
        
        
        int tmp = stk.pop();
        insertAtBottom(stk, num);
        stk.push(tmp); 
        
    }
    
    
    
    public static void solution(Stack<Integer> stk){
        
        if(stk.isEmpty()){
            return; 
        }
        
        int tmp = stk.pop();
        solution(stk);
        insertAtBottom(stk, tmp);
        
    }
    
    
    
    
    public static void main(String args[]) {
      Stack<Integer> stk = new Stack<>();
      stk.push(1);
      stk.push(2);
      stk.push(3);
      
      solution(stk);
      
      while(!stk.isEmpty()){
          int num = stk.pop();
          System.out.println(num); 
      }
      
    }
}
