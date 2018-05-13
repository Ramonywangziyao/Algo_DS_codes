class LRUCache {
    class DoublyLinkedListNode {
        DoublyLinkedListNode pre;
        DoublyLinkedListNode next;
        int val;
        int key;
    }

    Map<Integer,DoublyLinkedListNode> m;
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;
    int counter, capacity;


    public void addNode(DoublyLinkedListNode n) {
        n.next = head.next;
        n.pre = head;
        head.next.pre = n;
        head.next = n;
    }

    public void removeNode(DoublyLinkedListNode n) {
        DoublyLinkedListNode pre = n.pre;
        DoublyLinkedListNode post = n.next;
        pre.next = post;
        post.pre = pre;
    }

    public void moveFromMidToHead(DoublyLinkedListNode n) {
        removeNode(n);
        addNode(n);
    }

    public void removeFromTail() {
        DoublyLinkedListNode tailNode = tail.pre;
        m.remove(tailNode.key);
        tailNode.pre.next = tail;
        tail.pre = tailNode.pre;
    }

    public LRUCache(int capacity) {
        head = new DoublyLinkedListNode();
        tail = new DoublyLinkedListNode();
        head.next = tail;
        tail.pre = head;

        m = new HashMap<Integer,DoublyLinkedListNode>();
        counter = 0;
        this.capacity = capacity;
    }

    public int get(int key) {
        DoublyLinkedListNode tmp = m.get(key);
        if(tmp == null) return -1;
        else {
            moveFromMidToHead(tmp);
            return tmp.val;
        }
    }

    public void put(int key, int value) {
        if(m.get(key) == null) {
            DoublyLinkedListNode tmp = new DoublyLinkedListNode();
            tmp.key = key;
            tmp.val = value;
            addNode(tmp);
            m.put(key,tmp);
            counter++;
            if(counter > capacity) {
                removeFromTail();
                counter--;
            }
        } else {
            DoublyLinkedListNode tmp = m.get(key);
            tmp.val = value;
            moveFromMidToHead(tmp);
        }
    }
}
