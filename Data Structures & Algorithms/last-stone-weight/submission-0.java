class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            maxHeap.add(x);
        }
        while(maxHeap.size()>1){
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if(first!=second){
                maxHeap.add(first-second);
            }
            else if(first==second && maxHeap.isEmpty()){
                return 0;
            }
            else if(first==second){
                continue;
            }
        }
        return maxHeap.peek();
        
    }
}
