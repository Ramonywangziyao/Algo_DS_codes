class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for(int j = 0; j < row.size(); j++) {
                int val = row.get(j);
                row.set(j, Math.min(val + triangle.get(i + 1).get(j), val + triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
