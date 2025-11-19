class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(nums[i]);
        }
        int i = 0;
        int res = 0;
        while(i <= n) {
            if(!list.contains(i)) res = i;
            i++;
        }
        return res;
    }
}