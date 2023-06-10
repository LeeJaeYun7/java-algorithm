class Solution {
    
    public boolean[][] visited; 
    public int[][] map;
    public int row, col; 
    public int[] dx ={-1, 1, 0, 0};
    public int[] dy ={0, 0, -1, 1};
    
    public boolean isInside(int x, int y){
        if(0<=x && x < row && 0<=y && y<col){
            return true;
        }else{
            return false; 
        }
    }
    
    public void dfs(int x, int y){
        
        visited[x][y] = true;
        
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(!isInside(nx,ny)){
                continue;
            }
            
            if(visited[nx][ny] == false && map[nx][ny] == 1){
                dfs(nx, ny);
            }
        }
        
    }
    
    
    public int numIslands(char[][] grid) {
        
        int island = 0; 
        row = grid.length;
        col = grid[0].length;
        
        map = new int[row][col];
        visited = new boolean[row][col];
        
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '0'){
                    map[i][j] = 0;
                }else if(grid[i][j] == '1'){
                    map[i][j] = 1;
                }
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(visited[i][j] == false && map[i][j] == 1){
                    island++; 
                    dfs(i, j);
                }
            }
        }
        
        
        return island; 
        
        
    }
}
