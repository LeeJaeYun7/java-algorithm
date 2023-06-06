import java.util.*;
import java.io.*;


class Node implements Comparable<Node>{
    
    int end;
    int weight;
    
    public Node(int end, int weight){
        this.end = end;
        this.weight = weight; 
    }
    
    @Override
    public int compareTo(Node obj){
        return this.weight - obj.weight; 
    }
    
    
}


public class Main {
    
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static ArrayList<Node>[] list;
    public static int[] dist; 
    public static boolean[] check; 
    public static int INF = 10000000;
    
    public static void dijkstra(int start){
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;
        
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            int cur = curr.end;
            // System.out.println("cur, check[cur]은?" + cur + " " + check[cur]);
            
            if(check[cur] == true) continue;
            check[cur] = true;
            
            for(Node node: list[cur]){
                // System.out.println("node.end, dist[node.end]는?" + node.end + " " + dist[node.end]);
                if(dist[node.end] > dist[cur] + node.weight){
                    
                    // System.out.println("이전 dist[node.end], dist[cur], node.weight는?" + dist[node.end] + " " + dist[cur] + " " + node.weight);
                    dist[node.end] = dist[cur] + node.weight;
                    // System.out.println("이후 dist[node.end], dist[cur], node.weight는?" + dist[node.end] + " " + dist[cur] + " " + node.weight);
                    pq.add(new Node(node.end, dist[node.end]));
                }
                
            }
            
            
        }
        
        
        
        
        
    }
    
    
    public static void main(String args[]) throws IOException{
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int V = Integer.parseInt(st.nextToken());
      int E = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(br.readLine());
      
      list = new ArrayList[V+1];
      dist = new int[V+1];
      check = new boolean[V+1];
      
      for(int i=1; i<=V; i++){
          list[i] = new ArrayList<>(); 
      }
      
      Arrays.fill(dist, INF);
      
      
      for(int i=1; i<=E; i++){
          st = new StringTokenizer(br.readLine());
          int start = Integer.parseInt(st.nextToken());
          int end = Integer.parseInt(st.nextToken());
          int weight=  Integer.parseInt(st.nextToken());
          // System.out.println("start, end, weight는?" + start + " " + end + " " + weight);
          list[start].add(new Node(end, weight));
      }
      
      
      
      
      dijkstra(K);
     
      StringBuilder sb = new StringBuilder();
      
      
      for(int i=1; i<=V; i++){
        // System.out.println("dist[i]는?" + dist[i]);
        if(dist[i] == INF) sb.append("INF");
        else sb.append(dist[i]);
        sb.append('\n');
      }
      
      
      System.out.println(sb.toString());
      
      
      
      
      
      
    }
}
