class Solution {
    public String reverseVowels(String s) {
	String output = "";
        String[] arr = s.split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        List<String> v = new ArrayList<>();
        List<Integer> rev = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("u");
        list.add("e");
        list.add("o");
        list.add("a");
        list.add("i");
        list.add("U");
        list.add("E");
        list.add("O");
        list.add("A");
        list.add("I");
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 0; j < list.size(); j++) {
                if (arr[i].equals(list.get(j))) {
                    v.add(arr[i]);
                }
            }
        }	
	for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < list.size(); j++) {
		    if (arr[i].equals(list.get(j))) {
			    rev.add(i);
		    }
	    }
    }
        for (int i = 0; i < v.size(); i++) {
            result.set(rev.get(i), v.get(i));
        }
        for (int i = 0; i < result.size(); i++) {
            output += result.get(i);
        }
        return output;
    }
}