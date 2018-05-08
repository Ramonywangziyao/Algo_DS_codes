
class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        for(int[] update : updates) {
            int end = update[1]+1;
            res[update[0]] += update[2];
            if(end < length) res[end] -= update[2];
        }
        for(int i = 0, sum = 0; i < length; i++) {
            sum += res[i];
            res[i] = sum;
        }
        return res;
    }
}
