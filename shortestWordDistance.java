class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        List<Integer> list = new ArrayList<>();
        int dis = Integer.MAX_VALUE;
        for(int i = 0, len = words.length; i < len; i++) {
            if(words[i].equals(word1)) list.add(i + 1);
            else if(words[i].equals(word2)) list.add(-(i + 1));
        }
        for(int i = 0, len = list.size() - 1; i < len; i++) {
            int idx1 = list.get(i), idx2 = list.get(i + 1);
            if(idx1 * idx2 < 0) {
                idx1 = idx1 < 0 ? -idx1 - 1 : idx1 - 1;
                idx2 = idx2 < 0 ? -idx2 - 1 : idx2 - 1;
                dis = Math.min(dis, idx2 - idx1);
            }
        }
        return dis;
    }
}
