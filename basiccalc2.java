public class Solution {
    public int calculate(String s) {
        int len = s.length();
        if(s == null || len == 0) return 0;
        Stack<Integer> st = new Stack<>();
        int num = 0;
        char sign = '+';
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            if(!Character.isDigit(c) && c != ' ' || i == len - 1) {
                if(sign == '+') {
                    st.push(num);
                } else if(sign == '-') {
                    st.push(-num);
                } else if(sign == '*') {
                    st.push(st.pop() * num);
                } else if(sign == '/') {
                    st.push(st.pop() / num);
                }
                num = 0;
                sign = c;
            }
        }
        int res = 0;
        for(int i : st) res += i;
        return res;
    }
}
