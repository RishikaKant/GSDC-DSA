public class MinStack {
    Stack <Integer> s = new Stack<>();
    Stack <Integer> min = new Stack<>();  
    public MinStack() {}
    
    public void push(int val) {
        if(min.isEmpty() || val<= min.peek()){
            min.push(val); 
        } 
        s.push(val);
    }
    
    public void pop() {
         if(s.peek().equals(min.peek())){
            min.pop(); 
        } 
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
