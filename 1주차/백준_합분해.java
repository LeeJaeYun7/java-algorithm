// 왜 맞았는가?
// 1. DP로 풀 수 있는 문제이다.
// 2. N이 1일 때, 그리고 K가 1일 때, 각각에 대해 초기값을 구한다.
// 3. 그리고 그 데이터들을 기반으로 규칙성을 찾는다.
// 4. 규칙성을 기반으로 DP 식을 세워서 답을 구한다. 


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
