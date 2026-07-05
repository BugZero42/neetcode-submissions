class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.get(stack.size() - 1);      
                int second = stack.get(stack.size() - 2);   
                int newScore = top + second;
                stack.push(newScore);
                total += newScore;
            }
            else if (op.equals("D")) {
                int newScore = stack.peek() * 2;
                stack.push(newScore);
                total += newScore;
            }
            else if (op.equals("C")) {
                total -= stack.pop();
            }
            else {
                int num = Integer.parseInt(op);
                stack.push(num);
                total += num;
            }
        }
        return total;
    }
}