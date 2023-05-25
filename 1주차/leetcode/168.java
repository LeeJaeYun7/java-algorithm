// 왜 맞았는가?
// 1. 맨 끝에서부터 26씩 나눴을 때의 나머지를 더해준다
// 2. 그러한 작업을 계속해서 반복한다
// 3. 그 결과를 String에 붙인 후, 뒤집어준다. 

class Solution {
    public String convertToTitle(int columnNumber) {

            String res ="";

            while(columnNumber >= 1){
                columnNumber--;
                res += (char)('A'+(columnNumber % 26));
                columnNumber /= 26;
            }

            StringBuilder sb = new StringBuilder(res);  
            String reversed = sb.reverse().toString();
            return reversed; 
    }

}
