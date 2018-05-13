class Solution {
    PriorityQueue<ListNode> q;

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length < 1) return null;
        q = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
            public int compare(ListNode x, ListNode y) {
                if(x.val < y.val) return -1;
                if(x.val > y.val) return 1;
                else return 0;
            }
        });
        for(ListNode n : lists) if(n!=null) q.add(n);
        ListNode pt = new ListNode(0), ans = pt;
        while(!q.isEmpty()) {
            pt.next = q.poll();
            pt = pt.next;
            if(pt.next!=null) q.add(pt.next);
        }
        return ans.next;
    }
}
