/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int[] start = new int[intervals.size()];
        int[] end = new int[intervals.size()];

        for(int i = 0; i<intervals.size(); i++){
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(end);
        Arrays.sort(start);
        int s = 0, e = 0, res = 0, count =0;
        while(s<intervals.size()){
            if(start[s]<end[e]){
                s++;
                count++;
            }
            else{
                e++;
                count--;
            }
            res = Math.max(res,count);
        }
        if(res>1) return false;
        else{
            return true;
        }

    }
}
