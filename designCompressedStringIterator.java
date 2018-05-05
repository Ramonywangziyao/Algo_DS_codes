class StringIterator {
    Queue<int[]> q;
    public StringIterator(String compressedString) {
        q = new LinkedList<int[]>();
        int i = 0, j = i+1, len = compressedString.length();
        while(i < len) {
            while(j < len && compressedString.charAt(j) - 'A' < 0) j++;
            q.add(new int[]{compressedString.charAt(i)-'A',Integer.parseInt(compressedString.substring(i+1,j))});
            i = j++;
        }
    }

    public char next() {
        if(q.peek() == null) return ' ';
        int[] tmp = q.peek();
        if(--tmp[1] == 0) q.poll();
        return (char)(tmp[0]+'A');
    }

    public boolean hasNext() {
        return q.peek() == null ? false : true;
    }
}
