class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";
        for(String token : tokens){
            if(operators.indexOf(token)!=-1){
                int d1 = stack.pop();
                int d2 = stack.pop();
                if(token.equals("+")){
                    stack.push(d2+d1);
                }
                else if(token.equals("-")){
                    stack.push(d2-d1);
                }
                else if(token.equals("*")){
                    stack.push(d2*d1);
                }
                else if(token.equals("/")){
                    stack.push(d2/d1);
                } 
            }
            else{
                stack.push(Integer.parseInt(token));
            }
            
        }
        return stack.peek();
    }
}
