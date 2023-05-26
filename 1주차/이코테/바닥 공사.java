// 왜 맞았는가?
// 1. 점화식의 규칙을 찾는다
// 2. 그 다음에 그 규칙에 따라 DP 관계식을 작성한다. 

import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int[] dp = new int[N+10];
      
      dp[1] = 1;
      dp[2] = 3; 
      
      for(int i=3; i<=N; i++){
          dp[i] = (2*dp[i-2]+dp[i-1]) % 796796; 
      }
      
      System.out.println(dp[N]);
      
    }
}
