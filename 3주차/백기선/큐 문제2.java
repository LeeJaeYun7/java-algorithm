public class Main {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int size = N; 
      
      TreeMap<Integer, Integer> map = new TreeMap<>();
      
      for(int i=1; i<=20; i++){
          int num = (int)(Math.random()*100)+1;
          
          if(map.size() < size){
              map.put(i, num);
              continue;
          }
          
          boolean isExist = false;
          int pos = -1;
          
          for(Integer key: map.keySet()){
              int val = map.get(key);
              if(num == val){
                  isExist = true;
                  pos = key;
                  break; 
              }
          }
          
          if(isExist == true){
              map.remove(pos);
              map.put(i, num);
              continue;
          }
          
          map.pollFirstEntry();
          map.put(i, num);
          
      }
      
      
    }
}
