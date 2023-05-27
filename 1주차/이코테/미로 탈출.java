// 왜 맞았는가?
// 1. isInside, dx, dy 조건을 잘 채워줘야 한다
// 2. 0을 기준으로 할지, 1을 기준으로 할지를 명확하게 해줘야 한다. 

import java.util.*; 

class Pair{
    int x; 
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y; 
    }
}


public class Main {
    
    public static int N;
    public static int M;
    public static int[][] map;
    public static int[][] count; 
    
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {1, -1, 0, 0};
    
    public static boolean isInside(int x, int y){
        if(0<=x && x<N && 0<=y && y<M){
            return true;
        }else{
            return false; 
        }
    }
    
    
    public static void bfs(int sx, int sy){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sx,sy));
        count[sx][sy] = 1;
        
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            if(x == N-1 && y == M-1){
                break; 
            }
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(!isInside(nx,ny)){
                    continue;
                }
                
                if(count[nx][ny] == 0 && map[nx][ny] == 1){
                    q.add(new Pair(nx,ny));
                    count[nx][ny] = count[x][y] + 1; 
                }
                
            }
            
            
            
            
        }
        
        
        
        
        
    }
    
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      N = sc.nextInt();
      M = sc.nextInt();
      
      map = new int[N+1][M+1];
      count = new int[N+1][M+1];
      
      
      for(int i=0; i<N; i++){
          String str = sc.next(); 
          
          for(int j=0; j<M; j++){
              map[i][j] = str.charAt(j)-'0';
          }
      }
      
      
      bfs(0, 0);
      
      
      
      
      System.out.println(count[N-1][M-1]);
      
      
      
      
      
      
      
    }
}
