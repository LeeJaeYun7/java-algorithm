import java.util.*; 

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> brackets = new Stack<>();
        List<Character> openingBrackets = Arrays.asList('(', '{', '[');
        List<Character> closingBrackets = Arrays.asList(')', '}', ']');

        for(Character c: s.toCharArray()){

            if(openingBrackets.contains(c)){
                brackets.push(c);
            }else if(closingBrackets.contains(c)){
                if(brackets.isEmpty()){
                    return false;
                }
                char tmp = brackets.pop();

                if(openingBrackets.indexOf(tmp) != closingBrackets.indexOf(c)){
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}
