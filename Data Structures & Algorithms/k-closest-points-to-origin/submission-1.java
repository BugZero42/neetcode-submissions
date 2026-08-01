class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->euclideanDist(b)-euclideanDist(a));

        for(int[] point : points){
            maxHeap.offer(point);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        int[][] res = new int[k][2];
        for(int i =0; i<k; i++){
            res[i] = maxHeap.poll();
        }
        return res;

    }
    public int euclideanDist(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}
