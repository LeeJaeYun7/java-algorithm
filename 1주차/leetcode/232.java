import java.util.*; 

class MyQueue {

    public Stack<Integer> stk1;
    public Stack<Integer> stk2; 

    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();      
    }
    
    public void push(int x) {
        stk1.push(x);
    }
    
    public int pop() {
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
        int num = stk2.pop();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        return num;
    }
    
    public int peek() {
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
        int num = stk2.peek();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        return num; 
    }
    
    public boolean empty() {
        if(stk1.isEmpty()){
            return true;
        }else{
            return false; 
        }
    }
}
