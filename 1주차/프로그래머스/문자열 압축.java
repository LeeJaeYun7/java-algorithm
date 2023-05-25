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
