public class Vector2D implements Iterator<Integer> {
    ListIterator<List<Integer>> vec2dit;
    ListIterator<Integer> curit;
    public Vector2D(List<List<Integer>> vec2d) {
        vec2dit = vec2d.listIterator();
        if(vec2dit.hasNext()) curit = vec2dit.next().listIterator();
    }

    @Override
    public Integer next() {
        return curit.next();
    }

    @Override
    public boolean hasNext() {
        if(curit == null) return false;
        if(curit.hasNext()) return true;
        while(vec2dit.hasNext() && !curit.hasNext()) {
            curit = vec2dit.next().listIterator();
        }
        return curit.hasNext();
    }
}
