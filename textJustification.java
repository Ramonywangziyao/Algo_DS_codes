class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        if(words == null || words.length == 0) return res;
        int curLen = 0;
        List<String> line = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            if(curLen + len <= maxWidth) {
                line.add(word);
                curLen += len + 1;
            } else {
                res.add(packLine(line, curLen, maxWidth, false));
                i--;
                line = new ArrayList<>();
                curLen = 0;
            }
        }
        res.add(packLine(line, curLen, maxWidth, true));
        return res;
    }

    public String packLine(List<String> line, int len, int max, boolean last) {
        int remin = max - len + line.size();
        int slot = line.size() - 1;
        int each = slot == 0 ? 0 : last ? 1 : remin / slot;
        int extra = last ? 0 : each * slot == remin ? 0 : remin - (each * slot), extra_val = extra > 0 ? 1 : 0;
        String res = "";
        for(int i = 0, j = 0; i < line.size() + slot; i++) {
            if(i % 2 == 0) res += line.get(j++);
            else {
                for(int k = 0; k < each + extra_val; k++) res += " ";
                extra--;
                if(extra == 0) extra_val = 0;
            }
        }
        while(res.length() < max) res += " ";
        return res;
    }
}
