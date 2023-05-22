// 왜 맞았는가?
// 1. 4번 돌았을 때, 검사하는 것에 주의해야 한다.
// -> dx, dy를 그대로 활용하는 것이 아니라, 문제의 조건에 맞게 활용해야 한다
// -> 이 점을 매우 주의해야 한다. 실수하기 쉬운 부분일 수 있음. 

import java.util.*; 

public class Main {
    
    public static int N;
    public static int M;
    public static int[][] map;
    public static boolean[][] visited; 
    public static int[] dx ={0, -1, 0, 1};
    public static int[] dy ={-1, 0, 1, 0};
    public static boolean isInside(int x, int y){
        if(0<=x && x<N && 0<=y && y<M){
            return true;
        }else{
            return false; 
        }
    }
    
    
    public static void dfs(int x, int y, int d){
        
        
        visited[x][y] = true;
        int cnt = 0; 
        
        while(true){
            
            
            
            if(cnt == 4){
                
                int nx = 0;
                int ny = 0;
                
                if(d == 0){
                    nx = x+1;
                    ny = y;
                }else if(d == 1){
                    nx = x;
                    ny = y-1;
                }else if(d == 2){
                    nx = x-1;
                    ny = y;
                }else{
                    nx = x;
                    ny = y+1;
                }
                
                if(!isInside(nx,ny) || map[nx][ny] == 1){
                    return;
                }else{
                    dfs(nx, ny, d); 
                }
                
            }else{
                
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(isInside(nx,ny) && visited[nx][ny] == false && map[nx][ny] == 0){
                    dfs(nx, ny, d);
                }else{
                    
                    if(d == 0){
                        d = 3;
                    }else{
                        d -= 1;
                    }
                    cnt++;
                }
                
            }
            
            
            
            
            
            
        }
        
        
        
        
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      N = sc.nextInt();
      M = sc.nextInt();
      
      map = new int[N][M];
      visited = new boolean[N][M];
      int ans = 0; 
      
      int x = sc.nextInt();
      int y = sc.nextInt();
      int d = sc.nextInt();
      
      for(int i=0; i<N; i++){
          for(int j=0; j<M; j++){
              map[i][j] = sc.nextInt();
          }
      }
      
      dfs(x, y, d);
      
      
      for(int i=0; i<N; i++){
          for(int j=0; j<M; j++){
              if(visited[i][j] == true){
                  ans++;
              }
          }
      }
      
      System.out.println(ans);       
      
      
    }
}
