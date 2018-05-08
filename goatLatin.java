class Solution {
    public String toGoatLatin(String S) {
        String[] arr = S.split("\\ ");
        String res = "", s;
        for(int i = 0, len = arr.length; i < len; i++) {
            s = arr[i];
            if("AEIOUaeiou".contains(s.charAt(0)+"")) s += "ma";
            else s = s.substring(1,s.length())+s.charAt(0)+"ma";
            for(int j = 0; j < i+1; j++) s += "a";
            res += i != len-1 ? s + " " : s;
        }
        return res;
    }
}
