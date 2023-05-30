import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int[][] dp = new int[N+1][2];
      int[] arr = new int[N+1];
      int ans = Integer.MIN_VALUE;
      
      for(int i=1; i<=N; i++){
          arr[i] = sc.nextInt();
      }
      
      dp[1][1] = arr[1];
      dp[1][0] = 0;
      
      
      for(int i=2; i<=N; i++){
          dp[i][1] = dp[i-1][0] + arr[i];
          dp[i][0] = dp[i-1][1];
      }
      
      ans = Math.max(dp[N][1], dp[N][0]);
      
      System.out.println(ans); 
      
      
      
    }
}
