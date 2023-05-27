import java.util.*; 

class Pair implements Comparable<Pair>{
    
    String name;
    int score;
    
    public Pair(String name, int score){
        this.name = name;
        this.score = score; 
    }
    
    @Override
    public int compareTo(Pair obj){
        return this.score-obj.score; 
    }
    
    
}


public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      ArrayList<Pair> arr = new ArrayList<>();
      
      for(int i=0; i<N; i++){
          String name = sc.next();
          int score = sc.nextInt(); 
          arr.add(new Pair(name, score));
      }
      
      Collections.sort(arr);
      
      for(int i=0; i<N; i++){
          System.out.print(arr.get(i).name+ " ");
      }
      
      
      
    }
}
