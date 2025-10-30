/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode leader = head;
        ListNode lagger = head;
        while(leader != null && leader.next != null) {
            leader = leader.next.next;
            lagger = lagger.next;
            if(leader  == lagger) {
                return true;
            }
        }
        return false;
    }
}