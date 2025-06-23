class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String output = "";
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } else {
            int GCD = gcd(str1.length(), str2.length());
            output = str1.substring(0, GCD);
            return output;
        }
    }
    public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}