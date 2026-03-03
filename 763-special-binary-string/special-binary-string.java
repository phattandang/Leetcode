class Solution {
    public String makeLargestSpecial(String s) {
        int count = 0;
        int i = 0;
        List<String> list = new ArrayList<>();
        for(int j = 0; j < s.length(); ++j) {
            if(s.charAt(j) == '1') count++;
            else                   count--;

            if(count == 0) {
                String middle = s.substring(i + 1, j);
                String optimized = makeLargestSpecial(middle);
                list.add("1" + optimized + "0");
                i = j + 1;
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        return String.join("", list);
    }
}