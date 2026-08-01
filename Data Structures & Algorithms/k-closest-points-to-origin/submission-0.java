class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparing(this::euclideanDist));

        for(int[] point: points){
            queue.offer(point);
        }
        int[][] res = new int[k][2];
        for(int i= 0; i<k ; i++){
            res[i] = queue.poll();
        }
        return res;
    }
    public int euclideanDist(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}
