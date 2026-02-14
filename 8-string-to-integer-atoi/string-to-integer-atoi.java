class Solution {
    public int myAtoi(String s) {
        if(s == null) return 0;
        s = s.strip();
        if(s.length() == 0) return 0;
        int i = 0;
        int sign = 1;
        char first = s.charAt(0);
        if(first == '-' || first == '+') {
            sign = (first == '-') ? -1 : 1;
            i++;
        }
        int res = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7))
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + digit;
            i++;
        }
        return res * sign;
    }
}