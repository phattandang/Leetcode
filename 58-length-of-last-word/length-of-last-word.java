class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1) return 1;
        int len = 0;
        int i = s.length() - 1;
        int j = s.length() - 2;
        while (i >= 0) {
            if(s.charAt(i) == ' ') {
                i--;
                j--;
            } else if (s.charAt(i) != ' ') {
                len++;
                i--;
                if(j < 0 || s.charAt(j) == ' ') break;
                j--;
            }
        }
        return len;
    }
}