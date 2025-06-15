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
    public int pairSum(ListNode head) {
        int result = 0;
        ListNode leader = head;
        ListNode lagger = head;
        while (leader != null && leader.next != null) {
            leader = leader.next.next;
            lagger = lagger.next;
        }
        ListNode temp = null;
        while (lagger != null) {
            ListNode curr = lagger.next;
            lagger.next = temp;
            temp = lagger;
            lagger = curr;
        }
        while (head != null && head.next != null) {
            int sum = head.val + temp.val;
            result = Math.max(result, sum);
            head = head.next;
            temp = temp.next;
        }
        return result;
    } 
}