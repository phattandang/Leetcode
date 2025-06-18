class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (!stack.empty() && stack.peek() > 0 && i < 0 && Math.abs(i) == stack.peek()) {
                stack.pop();
            } else if (!stack.empty() && stack.peek() > 0 && i < 0 && Math.abs(i) < stack.peek()) {
                continue;
            } else if (!stack.empty() && stack.peek() > 0 && i < 0 && Math.abs(i) > stack.peek()) {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else if (!stack.empty() && stack.peek() < 0 && i < 0) {
                    stack.push(i);
                } else if (!stack.empty() && stack.peek() < Math.abs(i)) {
                    stack.pop();
                    if (!stack.empty() && stack.peek() < Math.abs(i)) {
                        while (true) {
                            if (!stack.empty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                                stack.pop();
                            } else {
                                break;
                            }
                        }
                    }
                    if (!stack.empty() && stack.peek() < 0 && i < 0) {
                        stack.push(i);
                    } else if (stack.empty()) {
                        stack.push(i);
                    } else if (stack.peek() < Math.abs(i)) {
                        stack.pop();
                        if (!stack.empty() && stack.peek() > Math.abs(i)) {
                            continue;
                        } else {
                            stack.push(i);
                        }
                    } else if (!stack.empty() && stack.peek() == Math.abs(i)) {
                    stack.pop();
                    }
                } else if (!stack.empty() && stack.peek() == Math.abs(i)) {
                    stack.pop();
                }
            } else {
                stack.push(i);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] += stack.pop();
        }  
        return result;
    }
}