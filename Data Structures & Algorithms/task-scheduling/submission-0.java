class Solution {
    class Task{
        int time;
        int count;
        public Task(int time, int count){
            this.time = time;
            this.count = count;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        int[] freq = new int[26];

        PriorityQueue<Task> pq = new PriorityQueue<>((a,b)->b.count-a.count);

        for(char task : tasks){
            freq[task-'A']++;
        }

        for(int i = 0; i<26; i++){
            if(freq[i]>=1){
                pq.offer(new Task(0,freq[i]));
            }
        }

        Queue<Task> q = new LinkedList<>();
        while(!pq.isEmpty() || !q.isEmpty()){
            if(!q.isEmpty() && time-q.peek().time > n ){
                pq.add(q.remove());
            }
            if(!pq.isEmpty()){
                Task t = pq.remove();
                t.count--;
                t.time = time;
                if(t.count>0){
                    q.add(t);
                }
            }
            time++;
        }
        return time;
    }
}
