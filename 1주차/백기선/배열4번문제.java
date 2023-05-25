import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[110];
      
      for(int i=0; i<50; i++){
          int num = (int)(Math.random()*100)+1;
          arr[num] += 1;
      }
      
      for(int i=1; i<=100; i++){
          int cnt = arr[i];
          if(cnt == 0){
              continue;
          }
          for(int j=1; j<=cnt; j++){
           System.out.print(i+" ");  
          }
      }
      
      
      
    }
}
