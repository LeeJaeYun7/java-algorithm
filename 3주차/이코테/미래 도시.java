import java.util.*;
import java.io.*; 



public class Main {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[][] dist; 
    public static int INF = 10000000;
    
    public static void main(String args[]) throws IOException{
        
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      
      dist = new int[N+1][N+1];
      
      for(int i=1; i<=N; i++){
          for(int j=1; j<=N; j++){
              if(i == j){
                  dist[i][j] = 0; 
              }else{
                  dist[i][j] = INF; 
              }
          }
      }
      
      for(int i=1; i<=M; i++){
          st = new StringTokenizer(br.readLine());
          int start = Integer.parseInt(st.nextToken());
          int end = Integer.parseInt(st.nextToken());
          dist[start][end] = 1;
          dist[end][start] = 1; 
      }
      
      for(int k=1; k<=N; k++){
          for(int i=1; i<=N; i++){
              for(int j=1; j<=N; j++){
                  dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
              }
          }
      }
      
      
      st = new StringTokenizer(br.readLine());
      int K = Integer.parseInt(st.nextToken());
      int X = Integer.parseInt(st.nextToken());
      
      if(dist[1][K] != INF && dist[K][X] != INF){
          System.out.println(dist[1][K] + " " + dist[K][X]);
          System.out.println(dist[1][K] + dist[K][X]);
      }else{
          System.out.println(-1); 
      }
      
      
      
      
      
      
      
      
        
    }
}
