class Solution {
    public boolean closeStrings(String word1, String word2) {
        boolean result = false;
        String[] arr = word1.split("");
        String[] arr1 = word2.split("");
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if (word1.length() != word2.length()) {
            result = false;
        } else {
            for (String i : arr) {
                if (!(map.containsKey(i))) {
                    map.put(i, 1);
                } else {
                    map.put(i, map.get(i) + 1);
                }
            }
            for (String i : arr1) {
                if (!(map1.containsKey(i))) {
                    map1.put(i, 1);
                } else {
                    map1.put(i, map1.get(i) + 1);
                }
            }
            for (String i : map.keySet()) {
                list.add(map.get(i));
            }
            for (String i : map1.keySet()) {
                if (list.contains(map1.get(i)) && map1.containsValue(map.get(i))) {
                        list.remove(map1.get(i));
                        if (list.isEmpty()) {
                            result = true;
                        }
                }
            }
        }
        return result;
    }
}