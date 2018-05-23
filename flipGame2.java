class Solution {
    public boolean canWin(String s) {
        if(s == null || s.length() < 2) return false;
        for(int i = 0; i< s.length()-1;i++){
            if(s.startsWith("++",i)) {
                String newS = s.substring(0,i)+"--"+s.substring(i+2);
                if(!canWin(newS)) {
                    return true;
                }
            }
        }
        return false;
    }

}
