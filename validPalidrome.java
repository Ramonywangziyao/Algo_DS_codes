class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        for(int i = 0, len = s.length(), j = len - 1; i<=j; i++, j--) {
            while(i < len && !isValid(s.charAt(i))) i++;
            while(j >= 0 && !isValid(s.charAt(j))) j--;
            if(j < i) break;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        }
        return true;
    }

    public boolean isValid(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
