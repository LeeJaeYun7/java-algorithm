import java.util.*; 

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }else{
                if(stk.size() == 0){
                    return false; 
                }

                char tmp = stk.peek();

                if( (tmp == '(' && c == ')') || (tmp == '[' && c == ']') || (tmp == '{' && c == '}')){
                stk.pop();              
                }else{
                    return false; 
                }
            }
        }

        if(stk.size() == 0){
            return true;
        }else{
            return false; 
        }


    }
}
