class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumRight = new int[nums.length];
        int[] sumLeft = new int [nums.length];
        int sum = 0;
        int pivot = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sumLeft[i] = 0;
                sum += nums[i];
            } else {
                sumLeft[i] = sum;
                sum += nums[i];
            }
        }
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                sumRight[i] = 0;
                sum += nums[i];
            } else {
                sumRight[i] = sum;
                sum += nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                pivot = i;
                break;
            }
        }
        return pivot;
    }
}