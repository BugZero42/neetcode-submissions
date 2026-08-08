class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[1]));
        int count = 1;
        int[] prev = intervals[0];
        for(int i =1; i< intervals.length; i++){
            if(prev[1]<=intervals[i][0]){
                prev = intervals[i];
                count++;
            }   
        }
        return intervals.length-count;

    }
}
