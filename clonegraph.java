public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer,UndirectedGraphNode> map = new HashMap<>();
        return clone(map,node);
    }

    public UndirectedGraphNode clone(Map<Integer,UndirectedGraphNode> m, UndirectedGraphNode node) {
        if(node == null) return null;
        if(m.containsKey(node.label)) return m.get(node.label);
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        m.put(clone.label,clone);
        for(UndirectedGraphNode n : node.neighbors) {
            clone.neighbors.add(clone(m,n));
        }
        return clone;
    }
}
