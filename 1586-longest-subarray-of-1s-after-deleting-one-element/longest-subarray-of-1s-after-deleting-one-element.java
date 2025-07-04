class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int k = 1;
        while (j < nums.length) {
            if (nums[j] == 0) {
                j++;
                k--;
                if (k < 0) {
                    i++;
                    if (nums[i - 1] == 0) {
                        k++;
                    }
                }
            } else {
                j++;
                if (k < 0) {
                    i++;
                    if (nums[i - 1] == 0) {
                        k++;
                    }
                }
            }
        }
        return j - i - 1;
    }
}