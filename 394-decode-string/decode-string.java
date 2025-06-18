class Solution {
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                num.push(count);
                count = 0;
                stack.push(result);
                result = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = result;
                result = stack.pop();
                int repeat = num.pop();
                for (int i = 0; i < repeat; i++) {
                    result.append(temp);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}