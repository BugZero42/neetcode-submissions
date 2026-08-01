class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i< stones.length; i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1==s2){
                continue;
            }
            else if(s1>s2){
                pq.offer(s1-s2);
            }
            else if(s2>s1){
                pq.offer(s2-s1);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }      
        else{
            return pq.peek();
        }
    }
}
