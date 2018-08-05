class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        Stack<Integer> stk = new Stack<Integer>();
        int res = Integer.MIN_VALUE, h = 0;
        for(int i = 0; i <= heights.length; i++) {
            h = i == heights.length ? -1 : heights[i];
            while(!stk.isEmpty() && heights[stk.peek()] > h) {
                int height = heights[stk.pop()];
                int start = stk.isEmpty() ? -1 : stk.peek();
                res = Math.max(res, height * (i - start - 1));
            }
            stk.push(i);
        }
        return res;
    }
}
