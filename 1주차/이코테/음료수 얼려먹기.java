import java.util.*; 

public class Main {
    
    public static int N;
    public static int M;
    public static int[][] map;
    public static boolean[][] visited; 
    public static boolean isInside(int x, int y){
        if(0<=x && x<N && 0<=y && y<M){
            return true;
        }else{
            return false; 
        }
    }
    
    public static int[] dx ={0, 0, 1, -1};
    public static int[] dy ={-1, 1, 0, 0};
    
    public static void dfs(int x, int y){
        
        visited[x][y] = true;
        
        
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(!isInside(nx, ny)){
                continue;
            }else{
                if(visited[nx][ny] == false && map[nx][ny] == 0){
                    dfs(nx, ny);
                }
            }
        }
        
        
    }
    
    
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      M = sc.nextInt();
      map = new int[N+1][M+1];
      visited = new boolean[N+1][M+1];
      int area = 0; 
      
      
      for(int i=0; i<N; i++){
          String str = sc.next();     
      
          for(int j=0; j<M; j++){
              map[i][j] = str.charAt(j)-'0';
          }
      }
      
      
      for(int i=0; i<N; i++){
          for(int j=0; j<M; j++){
              if(visited[i][j] == false && map[i][j] == 0){
                  area++;
                  dfs(i, j);
              }
          }
      }
      
      System.out.println(area); 
      
      
      
      
      
    }
}
