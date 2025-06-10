class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<int[]>> edges = new HashMap<>();
        for(int[] time : times) {
            edges.computeIfAbsent(time[0], key -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{0, k});
        Set<Integer> visited = new HashSet<>();
        int t = 0;
        while(!minHeap.isEmpty()) {
            int[] cur = minHeap.poll();
            int w1 = cur[0], s1 = cur[1];
            if(visited.contains(s1)) continue;
            visited.add(s1);
            t = w1;
            if(edges.containsKey(s1)) {
                for(int[] next : edges.get(s1)) {
                    int s2 = next[0], w2 = next[1];
                    if(!visited.contains(s2)) {
                        minHeap.offer(new int[]{w1 + w2, s2});
                    }
                }
            }
        }
        return visited.size() == n ? t : -1;
    }
}