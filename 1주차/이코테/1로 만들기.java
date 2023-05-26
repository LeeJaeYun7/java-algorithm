// 왜 맞았는가?
// 1. DP를 Bottom-up 방식으로 접근했다. 

import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      int[] dp = new int[N+10];
      
      for(int i=1; i<=N; i++){
          dp[i] = Integer.MAX_VALUE;
      }
      
      dp[1] = 0; 
      
      for(int i=2; i<=N; i++){
          
          if(i % 5 == 0){
              dp[i] = Math.min(dp[i], dp[i/5]+1);
          }
          
          if(i % 3 == 0){
              dp[i] = Math.min(dp[i], dp[i/3]+1);
          }
          
          
          if(i % 2 == 0){
              dp[i] = Math.min(dp[i], dp[i/2]+1);
          }
          
             
          dp[i] = Math.min(dp[i], dp[i-1]+1);
    }
    
    
    System.out.println(dp[N]);
    
      
      
      
    }
}
