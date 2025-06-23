class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
    return output.reverse().toString();
    }
}