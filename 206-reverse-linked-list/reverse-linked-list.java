/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode leader = head;
        ListNode lagger = null;

        while(leader != null) {
            ListNode temp = leader.next;
            leader.next = lagger;
            lagger = leader;
            leader = temp;
        }
        return lagger;
    }
}