class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(0);
        helper(graph,0, ans, tmp);
        return ans;
    }

    public void helper(int[][] graph, int i, List<List<Integer>> ans, List<Integer> tmp) {
        if(i == graph.length - 1) {
            ans.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int node : graph[i]) {
            tmp.add(node);
            helper(graph,node,ans,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
