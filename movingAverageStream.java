class MovingAverage {
    Queue<Integer> q;
    int sizeLimit, ct, sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        q = new LinkedList<Integer>();
        sizeLimit = size;
        ct = 0;
        sum = 0;
    }

    public double next(int val) {
        if(ct + 1 > sizeLimit) sum -= q.poll();
        else ct++;
        q.add(val);
        sum += val;
        return (double)sum/ct;
    }
}
