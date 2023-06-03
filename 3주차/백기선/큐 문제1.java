import java.util.*; 

public class Main {
    
    public static void recursive(Queue<Integer> q){
        
        if(q.size() == 0){
            return; 
        }
        
        int num = q.poll();
        recursive(q);
        q.add(num);
        
    }
    
    
    public static void main(String args[]) {
      
      Stack<Integer> stk = new Stack<>(); 
      Queue<Integer> q = new LinkedList<>();
      q.offer(1);
      q.offer(2);
      q.offer(3); 
      
      while(!q.isEmpty()){
          stk.push(q.poll());
      } 
      
      while(!stk.isEmpty()){
          int num = stk.pop();
          q.offer(num);
      } 
      
      while(!q.isEmpty()){
          System.out.println("num은?" + q.poll());
      }
    }
}
