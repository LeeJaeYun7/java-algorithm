import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int[] arr = new int[N+1];
      arr[1] = 0; 
      
      for(int i=2; i<=N; i++){
       
          arr[i] = Integer.MAX_VALUE; 
       
          if(i % 5 == 0){
              arr[i] = Math.min(arr[i], arr[i/5] + 1);
          }
          
          if(i % 3 == 0){
              arr[i] = Math.min(arr[i], arr[i/3] + 1);   
          }
          
          if(i % 2 == 0){
              arr[i] = Math.min(arr[i], arr[i/2] + 1);
          }
          
          arr[i] = Math.min(arr[i], arr[i-1]+1);
          
      }
      
      
      System.out.println(arr[N]);
      
      
    }
}
