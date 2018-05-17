public List<Integer> findSubstring(String s, String[] words) {
     List<Integer> res = new LinkedList<Integer>();
     if(s.length() == 0 || words.length == 0) return res;
     Map<String,Integer> m = new HashMap<String,Integer>();
     for(String word : words) {
         m.put(word, m.getOrDefault(word,0)+1);
     }
     int wordsLength = words.length, strLength = s.length(), wordLen =  words[0].length(), combineLength = wordLen * wordsLength;
     for(int i = 0; i < strLength - combineLength + 1; i++) {
         Map<String, Integer> seen = new HashMap<String, Integer>();
         int j = i;
         for(; j < combineLength + i; j += wordLen) {
             String tmp = s.substring(j,j + wordLen);
             if(m.containsKey(tmp)) {
                 seen.put(tmp, seen.getOrDefault(tmp,0) + 1);
                 if(seen.get(tmp) > m.get(tmp)) {
                     break;
                 }
             } else {
                 break;
             }
         }
         if(j == combineLength + i) {
             res.add(i);
         }
     }
     return res;
 }
 
