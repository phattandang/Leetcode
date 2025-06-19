class Solution {
    public int maxVowels(String s, int k) {
        List<Character> list = new ArrayList<>(Arrays.asList('u', 'e', 'o', 'a', 'i'));
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.charAt(i))) {
                count++;
            } if (i >= k && list.contains(s.charAt(i - k))) {
                    count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}