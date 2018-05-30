public int minMeetingRooms(Interval[] intervals) {
    int length = intervals.length, rooms = 0, endPos = 0;
    int[] starts = new int[length];
    int[] ends = new int[length];
    for(int i = 0; i < length; i++) {
        starts[i] = intervals[i].start;
        ends[i] = intervals[i].end;
    }
    Arrays.sort(starts);
    Arrays.sort(ends);
    for(int i = 0; i < length; i++) {
        if(starts[i] < ends[endPos]) {
            rooms++;
        } else {
            endPos++;
        }
    }
    return rooms;
}
