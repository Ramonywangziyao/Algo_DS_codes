class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        List<Integer> w1 = new ArrayList<>();
        List<Integer> w2 = new ArrayList<>();
        int res = Integer.MAX_VALUE, dis;
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.equals(word1)) w1.add(i);
            else if(word.equals(word2)) w2.add(i);
        }
        if(w2.size() == 0) {
            for(int i = 1; i < w1.size(); i++)
                res = Math.min(res, w1.get(i) - w1.get(i-1));
        } else {
            for(int pos1 = 0, pos2 = 0, p1, p2; pos1 < w1.size() || pos2 < w2.size();) {
                p1 = w1.get(pos1);
                p2 = w2.get(pos2);
                res = Math.min(Math.abs(p1 - p2),res);
                if(p1 < p2 && pos1 + 1 < w1.size()) pos1++;
                else if(p1 > p2 && pos2 + 1 < w2.size()) pos2++;
                else break;
            }
        }
        return res;
    }
}
