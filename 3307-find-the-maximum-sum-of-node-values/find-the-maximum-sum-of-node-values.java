class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {

         int n = nums.length;
        long result = 0;
        int xorApplied = 0;
        int loss = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int XOR = nums[i] ^ k;
            loss = Math.min(loss, Math.abs(nums[i] - XOR));

            if (XOR > nums[i]) {

                result += XOR;
                xorApplied++;
            } else {

                result += nums[i];

            }


        }


        if (xorApplied % 2 == 0) return result;

        return result - loss;
        
    }
}