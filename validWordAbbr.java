class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0, carry = 0, abrLen = abbr.length(), worLen = word.length(), start;
        while(i < worLen && j < abrLen) {
            if(Character.isLetter(abbr.charAt(j))) {
                if(word.charAt(i++) != abbr.charAt(j++)) return false;
            } else {
                if(abbr.charAt(j) == '0') return false;
                start = j;
                while(j < abrLen && Character.isDigit(abbr.charAt(j))) j++;
                i += Integer.parseInt(abbr.substring(start,j));
            }
        }
        return i != worLen || j != abrLen ? false : true;
    }
}
