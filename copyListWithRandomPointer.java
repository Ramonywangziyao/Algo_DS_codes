public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> m = new HashMap<>();
        RandomListNode headDup = head;
        while(headDup!=null) {
            m.put(headDup, new RandomListNode(headDup.label));
            headDup = headDup.next;
        }
        headDup = head;
        while(headDup!=null) {
            RandomListNode newHead = m.get(headDup);
            newHead.next = m.get(headDup.next);
            newHead.random = m.get(headDup.random);
            headDup = headDup.next;
        }
        return m.get(head);
    }
}
