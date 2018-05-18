class Solution {
    public int longestValidParentheses(String s) {
        int start = -1, count = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (st.isEmpty()) {
                    start = i;
                } else {
                    st.pop();
                    if (st.isEmpty()) {
                        count = Math.max(count, i - start);
                    } else {
                        count = Math.max(count, i - st.peek());
                    }
                }
            }
        }
        return count;
    }
}
