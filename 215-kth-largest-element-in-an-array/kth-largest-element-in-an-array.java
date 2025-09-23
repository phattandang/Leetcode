class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            maxHeap.offer(nums[i]);
        }
        k--;
        while(k > 0) {
            maxHeap.poll();
            k--;
        }
        return maxHeap.poll();
    }
}