import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      int[] arr = new int[k+1];
      int[] dp = new int[k+1];
      
      for(int i=1; i<=n; i++){
          arr[i] = sc.nextInt();
      }
      
      Arrays.sort(arr, 1, n+1);
      
      
      for(int i=arr[1]; i<=k; i+=arr[1]){
          dp[i] += 1;
      }
      
      dp[0] = 1; 
      
      for(int j=2; j<=n; j++){
          for(int i=1; i<=k; i++){
              if(i-arr[j] >= 0){
                  dp[i] += dp[i-arr[j]];
              }
          }
      }
      
      
      System.out.println(dp[k]);
      
      
      
      
      
    }
}
