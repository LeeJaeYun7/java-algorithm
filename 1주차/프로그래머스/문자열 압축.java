// 왜 맞았는가?
// 1. 문제의 조건에 유의해서, 식을 구현했다.
// 2. ArrayList에 String을 저장하고, 그것이 이전꺼와 일치하는지 체크했다.
// -> 일치하는 경우에는 cnt를 증가시키고, 일치하지 않는 경우에는 String ans에 추가해주었다.
// 3. substring을 할 때, end가 최대끝을 넘지 않도록 해야 한다.
// -> 그렇지 않으면, ArrayOutofBoundsException이 발생한다
// 4. 다 끝나고 나서도, 남은 것에 대해서 한 번 ans에 더해줘야 한다.
// -> 그래야, 남은 값들이 제대로 String ans에 더해진다. 


import java.util.*; 

class Solution {
    public int solution(String s) {
      int len = s.length();
      int minLen = Integer.MAX_VALUE; 
      
      
      for(int i=1; i<=len; i++){
          String ans = "";
          int cnt = 0;
          ArrayList<String> list = new ArrayList<>();
          
          for(int j=0; j<len; j+=i){
              int start = j;
              int end = j+i;
              if(end >= len){
                  end = len;
              }
              String tmp = s.substring(start, end);
          
              if(list.size() == 0){
                  list.add(tmp);
                  cnt++;
              }else{
                  
                  if(list.get(list.size()-1).equals(tmp)){
                      cnt++;
                  }else{
                      
                      if(cnt >= 2){
                          ans += Integer.toString(cnt);
                      }
                      ans += list.get(list.size()-1);
                      list.add(tmp); 
                      cnt = 1; 
                  }
              }
          }
          
          
          if(cnt >= 2){
              ans += Integer.toString(cnt);
          }
          ans += list.get(list.size()-1);
          
          
          minLen = Math.min(minLen, ans.length());
          
          
          
          
      }
      
      return minLen; 
      
    }
}
