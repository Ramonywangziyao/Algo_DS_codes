class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new LinkedList<>();
        for(int i = 0; i < input.length(); i++) {
            char op = input.charAt(i);
            if(op == '+' || op == '-' || op == '*') {
                String left = input.substring(0,i);
                String right = input.substring(i+1);
                List<Integer> ll = diffWaysToCompute(left);
                List<Integer> rl = diffWaysToCompute(right);

                for(int k : ll) {
                    for( int j : rl) {
                        int ans = 0;
                        if(op == '+') {
                            ans = k + j;
                        } else if(op == '-') {
                            ans = k - j;
                        } else if(op == '*') {
                            ans = k * j;
                        }
                        res.add(ans);
                    }
                }
            }
        }
        if(res.size() == 0) {
            res.add(Integer.parseInt(input));
        }
        return res;
    }
}
