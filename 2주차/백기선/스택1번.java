import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Stack<Integer> stk = new Stack<>();
      stk.push(1);
      stk.push(2);
      stk.push(3);
      
      Stack<Integer> reverseStk = new Stack<>();
      
      while(!stk.isEmpty()){
          reverseStk.push(stk.pop());
      }
      
      
    }
}
