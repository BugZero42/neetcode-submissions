class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        int[] curr = intervals[0];
        res.add(curr);

        for(int[] interval: intervals){
            if(interval[0]<=curr[1]){
                curr[1] = Math.max(curr[1],interval[1]);
            }
            else{
                curr = interval;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);


    }
}
