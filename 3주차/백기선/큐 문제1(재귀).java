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
      
      Queue<Integer> q = new LinkedList<>();
      q.offer(1);
      q.offer(2);
      q.offer(3); 
      
      recursive(q); 
      
      while(!q.isEmpty()){
          int num = q.poll();
          System.out.println("num은?" + num);
      } 
    }
}
