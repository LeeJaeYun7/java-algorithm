// 왜 맞았는가?
// 1. 오름차순 정렬과 내림차순 정렬을 했다.
// 2. 가장 작은 값들과 가장 큰 값들을 교체해줬다. 

import java.util.*; 

public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int K = sc.nextInt();
      
      ArrayList<Integer> arrA = new ArrayList<>();
      ArrayList<Integer> arrB = new ArrayList<>();
      
      for(int i=0; i<N; i++){
          int num = sc.nextInt();
          arrA.add(num);
      }
      
      for(int i=0; i<N; i++){
          int num = sc.nextInt();
          arrB.add(num);
      }
      
      
      Collections.sort(arrA);
      Collections.sort(arrB, Collections.reverseOrder());
      
      int sum = 0;
      int tmpA = 0;
      int tmpB = 0; 
      
      for(int i=0; i<N; i++){
          sum += arrA.get(i);
      }
      
      for(int i=0; i<K; i++){
          tmpA += arrA.get(i);   
      }
      
      for(int i=0; i<K; i++){
          tmpB += arrB.get(i);
      }
      
      
      System.out.println(sum-tmpA+tmpB);
      
      
      
      
    }
}
