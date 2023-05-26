// 왜 맞았는가?
// 1. DP에 대하여 두 가지 케이스로 나누고, Bottom-Up 방식으로 접근해서 문제를 풀었다. 

import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int ans = 0; 
      
      int[][] dp = new int[N+10][2];
      int[] arr = new int[N+10];
      
      for(int i=1; i<=N; i++){
          arr[i] = sc.nextInt();
      }
      
      dp[1][1] = arr[1];
      dp[1][0] = 0;
      
      
      for(int i=2; i<=N; i++){
          dp[i][1] = dp[i-1][0] + arr[i];
          dp[i][0] = dp[i-1][1];
      }
      
      ans = Math.max(dp[N][0], dp[N][1]);
      
      System.out.println(ans); 
      
      
 
    
      
      
      
    }
}
