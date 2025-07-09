class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        int rightMax = height[height.length - 1], leftMax = height[0];
        while(l < r) {
            if(height[l] < height[r]) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                max += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                max += rightMax - height[r];
            }
        }
        return max;
    }
}