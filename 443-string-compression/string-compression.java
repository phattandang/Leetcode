class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++]  = chars[i - 1];
                if (count > 1) {
                 for (char c  : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                 }
                }
                count = 1;
            }
        }
        if (chars.length == 1) {
            chars[index] = chars[0];
            index++;
        } else {
            chars[index++] = chars[chars.length - 1];
        } if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[index++] = c;
            }
        }
        return index;
    }
}