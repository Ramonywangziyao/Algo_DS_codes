class ValidWordAbbr {
    Map<String,Integer> s;
    Map<String,Integer> repeat;
    public ValidWordAbbr(String[] dictionary) {
        s = new HashMap<>();
        repeat = new HashMap<>();
        for(String str : dictionary) {
            repeat.put(str,repeat.getOrDefault(str,0)+1);
            String abbr = getAbbr(str);
            s.put(abbr,s.getOrDefault(abbr,0)+1);
        }
    }

    public boolean isUnique(String word) {
        String abbr = getAbbr(word);
        if(!s.containsKey(abbr) || (repeat.getOrDefault(word,0) == s.getOrDefault(abbr,0))) return true;
        return false;
    }

    private String getAbbr(String str) {
        if(str.length()==0) return 0+"";
        int len = str.length();
        return ""+str.charAt(0)+(len-2)+str.charAt(str.length()-1);
    }
}
