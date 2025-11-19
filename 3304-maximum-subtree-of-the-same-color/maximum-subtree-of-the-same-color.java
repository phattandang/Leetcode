class Solution {
    private List<Integer>[] graph;
    private int[] colors;
    private int[] size;
    private int maxSize;

    public int maximumSubtreeSize(int[][] edges, int[] colors) {
        int n = colors.length;
        this.colors = colors;
        this.size = new int[n];
        this.maxSize = 1;

        graph = new ArrayList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }    
        for(int[] e : edges) {
            int u = e[0];
            int v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        dfs(0, -1);
        return maxSize;
    }
    private boolean dfs(int u, int parent) {
        size[u] = 1;
        boolean mono = true;
        for(int v : graph[u]) {
            if(v == parent) continue;
            boolean childMono = dfs(v, u);
            size[u] += size[v];
            if(!childMono || colors[v] != colors[u]) mono = false;
        }
        if(mono) maxSize = Math.max(maxSize, size[u]);
        return mono;
    }
}