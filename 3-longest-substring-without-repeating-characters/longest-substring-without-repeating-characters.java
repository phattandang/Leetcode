class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < s.length(); j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            map.put(s.charAt(j), j);
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}