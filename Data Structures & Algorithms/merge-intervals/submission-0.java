class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));

        List<int[]> res = new ArrayList<>();

        int[] currInterval = intervals[0];
        res.add(currInterval);

        for(int[] interval : intervals){
            if(interval[0]<=currInterval[1]){
                currInterval[1]=Math.max(currInterval[1],interval[1]);
            }
            else{
                currInterval = interval;
                res.add(currInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
