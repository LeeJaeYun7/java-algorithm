import java.util.*;
import java.io.*; 

class Node implements Comparable<Node>{
    
    int end;
    int time;
    
    public Node(int end, int time){
        this.end = end;
        this.time = time;
    }
    
    @Override
    public int compareTo(Node obj){
        return this.time-obj.time; 
    }
    
}


public class Main {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int N, M, C;
    public static int[] dist; 
    public static boolean[] check; 
    public static ArrayList<Node>[] list; 
    public static int INF= 10000000; 
    
    public static void dijkstra(int start){
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0; 
        
        while(!pq.isEmpty()){
            
            Node curr = pq.poll();
            int cur = curr.end;
            
            if(check[cur] == true) continue;
            check[cur] = true;
            
            for(Node node: list[cur]){
                if(dist[node.end] > dist[cur] + node.time){
                    dist[node.end] = dist[cur] + node.time;
                    pq.add(new Node(node.end, dist[node.end]));
                }
            }
        }
        
        
        
    }
    
    
    
    public static void main(String args[]) throws IOException{
        
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      C = Integer.parseInt(st.nextToken());
      
      dist = new int[N+1];
      check = new boolean[N+1];
      list = new ArrayList[N+1];
      
      Arrays.fill(dist, INF);
      
      for(int i=1; i<=N; i++){
          list[i] = new ArrayList<>(); 
      }
      
      for(int i=1; i<=M; i++){
          st = new StringTokenizer(br.readLine());
          int start = Integer.parseInt(st.nextToken());
          int end = Integer.parseInt(st.nextToken());
          int time = Integer.parseInt(st.nextToken());
          list[start].add(new Node(end, time));
      }
      
      dijkstra(C);
      
      int maxTime = Integer.MIN_VALUE; 
      int cnt = 0; 
       
      for(int i=1; i<=N; i++){
         if(i == C || dist[i] == INF){
             continue;
         }
         cnt++;
         maxTime = Math.max(dist[i], maxTime);
      }          
        
      System.out.println(cnt + " " + maxTime);    
        
    }
}
