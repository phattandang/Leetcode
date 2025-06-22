class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int prefix = 0;
        for (int i = 0; i < gain.length; i++) {
                prefix += gain [i];
                result = Math.max(result, prefix);
        }
        return result;
    }
}