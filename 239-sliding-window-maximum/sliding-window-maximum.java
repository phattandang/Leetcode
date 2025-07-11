class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        int l = 0, r = 0;
        int[] res = new int[nums.length - k  + 1];
        while(r < nums.length) {
            while(!q.isEmpty() && nums[q.getLast()] < nums[r]) {
                q.removeLast();
            }
            q.addLast(r);
            if(l > q.getFirst()) {
                q.removeFirst();
            } if((r + 1) >= k) {
                res[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
