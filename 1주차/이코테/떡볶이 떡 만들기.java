import java.util.*; 

public class Main {
    
    public static ArrayList<Integer> arr; 
    public static int N;
    public static long M; 
    public static int ans; 
    
    public static void binarySearch(){
        
        int start = 0;
        int end = arr.get(N-1);
        
        
        while(start <= end){
            
            int mid = (start+end)/2; 
            long sum = 0; 
            
            for(int i=0; i<N; i++){
                if(arr.get(i)-mid >= 0){
                    sum += (arr.get(i)-mid);
                }
            }
            
            if(sum >= M){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1; 
            }
        }       
        
    }
    
    
    
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       N = sc.nextInt();
       M = sc.nextInt(); 
       arr = new ArrayList<>(); 
       
       for(int i=1; i<=N; i++){
           int num = sc.nextInt();
           arr.add(num);
       }
       
       Collections.sort(arr);
       
       
       binarySearch(); 
       
       System.out.println(ans); 
     
    }
}
