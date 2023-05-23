import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt(); 
      
      long[][] arr = new long[N+1][K+1];
      
      for(int i=1; i<=N; i++){
          arr[i][1] = 1;
      }
      
      for(int i=1; i<=K; i++){
          arr[1][i] = i;
      }
      
      
      for(int i=2; i<=N; i++){
          for(int j=2; j<=K; j++){
              arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % 1000000000;
          }
      }
      
      
      System.out.println(arr[N][K]);
      
    }
}
