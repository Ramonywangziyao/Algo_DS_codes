/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<>();
        if(newInterval == null) return intervals;
        for(int i = 0; i <= intervals.size(); i++) {
            if(i == intervals.size()) {
                intervals.add(newInterval);
                break;
            }
            Interval tmp = intervals.get(i);
            if(tmp.start >= newInterval.start) {
                intervals.add(i, newInterval);
                break;
            }
        }
        int left = intervals.get(0).start, right = intervals.get(0).end;
        for(int i = 1; i <= intervals.size(); i++) {
            if(i == intervals.size()) {
                res.add(new Interval(left, right));
                break;
            }
            Interval tmp = intervals.get(i);
            if(tmp.start > right) {
                res.add(new Interval(left, right));
                left = tmp.start;
                right = tmp.end;
            } else {
                right = Math.max(right, tmp.end);
            }
        }
        return res;
    }
}
