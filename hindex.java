class Solution {
    public int hIndex(int[] citations) {
        int length = citations.length, res = 0;
        int[] array2 = new int[length+1];
        for(int i = 0; i < length; i++) {
            if(citations[i] > length) {
                array2[length]++;
            }else{
                array2[citations[i]]++;
            }
        }
        for(int i = length; i>=0;i--){
            res += array2[i];
            if(res >= i) return i;
        }
        return 0;
    }
}
