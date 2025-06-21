class Solution {
    public void moveZeroes(int[] nums) {
        int move = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[move] = nums[i];
                move++;
            }
        }
        while (move < nums.length) {
            nums[move] = 0;
            move++;
        }
    }
}