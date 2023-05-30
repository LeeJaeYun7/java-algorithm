import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      int[] arr = new int[M+1];
      int[] dp = new int[M+1];
      
      for(int i=1; i<=N; i++){
          arr[i] = sc.nextInt();
      }
      
      for(int i=1; i<=M; i++){
          dp[i] = 10000000;
      }
      
     
      
      
      for(int j=1; j<=M; j++){
          for(int i=1; i<=N; i++){
              if(j-arr[i] >= 0){
                 dp[j] = Math.min(dp[j], dp[j-arr[i]]+1); 
              }
          }
      }
      
      
      if(dp[M] == 10000000){
          System.out.println(-1);
      }else{
          System.out.println(dp[M]);
      }
      
      
      
      
      
    }
}
