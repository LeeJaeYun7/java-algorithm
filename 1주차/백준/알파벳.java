import java.util.*; 

public class Main {
    
    public static int R;
    public static int C;
    public static char[][] map;
    public static int maxLen; 
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static boolean isInside(int x, int y){
        if(1<=x && x<=R && 1<=y && y<=C){
            return true;
        }else{
            return false; 
        }
    }
    
    public static void dfs(int x, int y, String curr){
        
        maxLen = Math.max(maxLen, curr.length());
        
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(!isInside(nx, ny)){
                continue;
            }
            
            if(!curr.contains(Character.toString(map[nx][ny]))){
                String next = curr + map[nx][ny];
                dfs(nx, ny, next);
                next = next.substring(0, next.length()-1);
                
            }
            
            
        }
        
        
        
    }
    
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      R = sc.nextInt();
      C = sc.nextInt();
      map = new char[R+10][C+10]; 
      maxLen = Integer.MIN_VALUE; 
      
      for(int i=1; i<=R; i++){
          String str = sc.next(); 
          
          for(int j=1; j<=C; j++){
              map[i][j] = str.charAt(j-1);
          }
      }
      
      String str = Character.toString(map[1][1]);
      
      dfs(1, 1, str);
      
      
      System.out.println(maxLen); 
    }
}
