class Solution {
    public int equalPairs(int[][] grid) {
        int result = 0;
        HashMap<Integer, int[]> map = new HashMap<>();
        HashMap<Integer, int[]> map1 = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            int[] arr = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                arr[j] += grid[i][j];
            }
            map.put(i, arr);
        }
        for (int i = 0; i < grid.length; i++) {
            int[] arr = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                arr[j] += grid[j][i];
            }
            map1.put(i, arr);
        }
        // for (int i = 0; i < grid.length; i++) {
            
        // }
        for (int i = 0; i < grid.length; i++) {
            int[] rowValues = map.get(i);
            for (int j = 0; j < grid.length; j++) {
                int[] colValues = map1.get(j);
                if (Arrays.equals(rowValues, colValues)) {
                result++;
                }
            }
        }
        return result;
    }
}