class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(i->i[1]));
        int[] prev = intervals[0];
        int count=1;
        for(int i = 1; i< intervals.length;i++ ){
            if(prev[1]<=intervals[i][0]){
                prev = intervals[i];
                count++;
            }
        }  
        return intervals.length-count;     
    }
}
