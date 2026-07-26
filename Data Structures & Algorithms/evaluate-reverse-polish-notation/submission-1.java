class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";
        for(String token : tokens){
            if(operators.indexOf(token)!=-1){
                int d1 = stack.pop();
                int d2 = stack.pop();
                int res = 0;
                if(token.equals("+")){
                    res = d2+d1;
                }
                else if(token.equals("-")){
                    res = d2-d1;
                }
                else if(token.equals("*")){
                    res = d2*d1;
                }
                else if(token.equals("/")){
                    res = d2/d1;
                }
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(token));
            }  
        } 
        return stack.peek();

        
    }
}
