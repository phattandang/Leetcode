class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int leftMax = height[i], rightMax = height[j];
        int max = 0;
        while(i < j) {
            if(height[i] < height[j]) {
                i++;
                leftMax = Math.max(leftMax, height[i]);
                max += leftMax - height[i];
            } else {
                j--;
                rightMax = Math.max(rightMax, height[j]);
                max += rightMax - height[j];
            }
        }
        return max;
    }
}
