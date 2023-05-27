// 왜 맞았는가?
// 1. Collections.sort와 Collections.reverseOrder를 통해서 내림차순 정렬이 가능하다 

import java.util.*; 

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      
      for(int i=0; i<N; i++){
          int num = sc.nextInt();
          arr.add(num);
      }
      
      Collections.sort(arr, Collections.reverseOrder());
      
      for(int i=0; i<N; i++){
          System.out.print(arr.get(i)+ " ");
      }
      
      
      
    }
}
