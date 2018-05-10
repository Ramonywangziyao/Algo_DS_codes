public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> s;
    public NestedIterator(List<NestedInteger> nestedList) {
        s = new Stack<NestedInteger>();
        List<NestedInteger> arr = new ArrayList<NestedInteger>(nestedList);
        for(int i = arr.size()-1; i >= 0; i--) s.push(arr.get(i));
    }

    @Override
    public Integer next() {
        return s.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!s.empty() && !s.peek().isInteger()) {
            List<NestedInteger> tmp = new ArrayList<NestedInteger>(s.pop().getList());
            for(int i = tmp.size()-1; i >= 0; i--) s.push(tmp.get(i));
        }
        return !s.empty();
    }
}
