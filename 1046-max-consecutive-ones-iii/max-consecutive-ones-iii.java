class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
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
        return j - i;
    }
}