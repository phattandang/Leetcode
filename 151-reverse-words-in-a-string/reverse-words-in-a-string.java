class Solution {
    public String reverseWords(String s) {
        String result = "";
       List<String> list = new ArrayList<>();
       String string = s.trim().replaceAll(" +", " ");
       String[] arr = string.split("");
       int space = string.length();
       for (int i = string.length() - 1; i >= 0; i--) {
           if (arr[i].equals(" ")) {
               for (int j = i + 1; j < space; j++) {
                   list.add(arr[j]);
               }
               if (i >= 0) {
                   list.add(" ");
               }
               space = i;
           } 
       }
       for (int i = 0; i < space; i++) {
           list.add(arr[i]);
       }
       for (int i = 0; i < list.size(); i++) {
           result += list.get(i);
       }
       return result;
    }
}