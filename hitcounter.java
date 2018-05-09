class HitCounter {
    int[] stmps;
    int[] hits;
    /** Initialize your data structure here. */
    public HitCounter() {
        stmps = new int[300];
        hits = new int[300];
    }

    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        int idx = timestamp % 300;
        if(stmps[idx] != timestamp) {
            stmps[idx] = timestamp;
            hits[idx] = 1;
        } else {
            hits[idx]++;
        }
    }

    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int total = 0;
        for(int i = 0; i < 300; i++) total += timestamp - stmps[i] < 300 ? hits[i] : 0;
        return total;
    }
}
