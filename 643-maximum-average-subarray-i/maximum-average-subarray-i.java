class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(i >= k - 1) {
                double average = sum / k;
                max = Math.max(max, average);
                sum -= nums[i - k + 1];
            }
        }
        return max;
    }
}