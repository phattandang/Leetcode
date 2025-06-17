class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int n = senate.length();
        for (int i = 0 ; i < senate.length(); i++){
            if (senate.charAt(i) == 'R'){
                rad.add(i);
            } else {
                dir.add(i);
            }
        }
        while (!rad.isEmpty() && !dir.isEmpty()){
            if (rad.peek() < dir.peek()){
                dir.remove();
                rad.remove();
                n++;
                rad.add(n);
            } else if (rad.peek() > dir.peek()){
                rad.remove();
                dir.remove();
                n++;
                dir.add(n);
            }
        }
        if (rad.isEmpty())
        {
            return "Dire";
        } else {
            return "Radiant";
        }
    }
}