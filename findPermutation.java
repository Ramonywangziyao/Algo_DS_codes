class Solution {
    public int[] findPermutation(String s) {
        int len = s.length();
        int[] res = new int[len+1];
        for(int i = 1; i <= len + 1; i++) res[i-1] = i;
        for(int i = 0; i < len; i++) {
            int start = i;
            if(s.charAt(i) == 'D') {
                while(i < len && s.charAt(i) == 'D') i++;
                swap(res,start,i);
            }
        }
        return res;
    }

    public void swap(int[] nums, int x, int y) {
        while(x < y) {
            int tmp = nums[x];
            nums[x] = nums[y];
            nums[y] = tmp;
            x++;y--;
        }
    }
}
