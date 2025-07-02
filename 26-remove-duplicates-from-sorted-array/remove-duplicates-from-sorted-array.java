class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int index  = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                nums[index] = nums[i];
                index++;
            }
            set.add(nums[i]);
        }   
        return index;
    }
}