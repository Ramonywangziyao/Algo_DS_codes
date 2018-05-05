class TwoSum {
    Map<Integer,Integer> m;
    /** Initialize your data structure here. */
    public TwoSum() {
        m = new HashMap<Integer,Integer>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        m.put(number,m.getOrDefault(number,0)+1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(Map.Entry<Integer,Integer> e : m.entrySet()) {
            int tmp = value - e.getKey(), res = m.getOrDefault(tmp,0);
            if((tmp != e.getKey() && res > 0) || (tmp == e.getKey() && res >= 2)) return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
