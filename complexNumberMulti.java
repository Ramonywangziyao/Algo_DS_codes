class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] aArr = a.split("\\+");
        String[] bArr = b.split("\\+");
        int aa = Integer.parseInt(aArr[0]), ab = Integer.parseInt(aArr[1].substring(0,aArr[1].length()-1)), ba = Integer.parseInt(bArr[0]), bb = Integer.parseInt(bArr[1].substring(0,bArr[1].length()-1));
        return Integer.toString(aa*ba+ab*bb*(-1))+"+"+Integer.toString(aa*bb+ab*ba)+"i";
    }
}
