class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int ct = 1, wid, lineSum = 0;
        boolean one = false;
        for(char c : S.toCharArray()) {
            wid = widths[c-'a'];
            if(lineSum+wid > 100) {
                ct++;
                lineSum = wid;
            } else {
                lineSum += wid;
            }
        }
        return new int[]{ct,lineSum};
    }
}
