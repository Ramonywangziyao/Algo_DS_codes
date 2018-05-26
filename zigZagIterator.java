public class ZigzagIterator {
    LinkedList<Iterator> v;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        v = new LinkedList<>();
        if(!v1.isEmpty())v.add(v1.iterator());
        if(!v2.isEmpty())v.add(v2.iterator());
    }

    public int next() {
        Iterator x = v.remove();
        int num = (Integer)x.next();
        if(x.hasNext()) v.add(x);
        return num;
    }

    public boolean hasNext() {
        return !v.isEmpty();
    }
}
