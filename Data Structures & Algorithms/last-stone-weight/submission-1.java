class Solution {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : stones){
            queue.offer(x);
        }
        while(queue.size()>1){
            int first = queue.poll();
            int second = queue.poll();
            if(first!=second){
                queue.offer(first-second);
            }
            else if(first==second && queue.isEmpty()){
                return 0;
            }
            else if(first==second){
                continue;
            }
        }
        return queue.peek();

        
    }
}
