class WordDistance {
    private Map<String,List<Integer>> map;
    public WordDistance(String[] words) {
        map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            List<Integer> tmp = map.getOrDefault(words[i],new ArrayList<Integer>());
            tmp.add(i);
            map.put(words[i],tmp);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> w1List = map.get(word1);
        List<Integer> w2List = map.get(word2);
        int i = 0, j = 0, distance = Integer.MAX_VALUE;
        while(i < w1List.size() && j < w2List.size()) {
            int w1 = w1List.get(i), w2 = w2List.get(j), diff = Math.abs(w1-w2);
            if(diff >= distance) {
                if(w1 > w2) j++;
                else if(w2 > w1) i++;
                else {
                    i++;
                    j++;
                }
            } else {
                distance = diff;
            }
        }
        return distance;
    }
}
