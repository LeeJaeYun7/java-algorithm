// 왜 맞았는가?
// 1. 이진 탐색을 적용한다
// 2. 이진 탐색을 적용하기 전에는, 무조건 정렬이 되어야 한다. 

import java.util.*; 

public class Main {
    
    public static ArrayList<Integer> arr; 
    
    
    public static boolean binarySearch(int num){
        
        int start = 0;
        int end = arr.size()-1; 
        
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(arr.get(mid) == num){
                return true;
            }else if(arr.get(mid) < num){
                start = mid+1;
            }else{
                end = mid-1; 
            }
        }
        
        
        return false; 
        
        
    }
    
    
    
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int N = sc.nextInt();
       arr = new ArrayList<>(); 
       
       for(int i=1; i<=N; i++){
           int num = sc.nextInt();
           arr.add(num);
       }
       
       Collections.sort(arr);
       
       int M = sc.nextInt();
       
       for(int i=1; i<=M; i++){
           int num = sc.nextInt(); 
           boolean res = binarySearch(num);
           if(res){
               System.out.println("yes");
           }else{
               System.out.println("no");
           }
       }
       
       
     
     
    }
}
