
class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList,1);
    }

    public int dfs(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        for(NestedInteger n : nestedList)
            sum += n.getInteger() != null ? n.getInteger() * depth : dfs(n.getList(), depth+1);
        return sum;
    }
}
