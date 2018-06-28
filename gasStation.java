class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length, gasTotal = 0, costTotal = 0, g = 0, c = 0, idx = 0;
        for(int i = 0; i < len; i++) {
            gasTotal += gas[i]; g += gas[i];
            costTotal += cost[i]; c += cost[i];
            if(g < c) {
                g = 0;
                c = 0;
                idx = -1;
            } else idx = idx != -1 ? Math.min(idx, i) : i;
        }
        return gasTotal >= costTotal ? idx : -1;
    }
}
