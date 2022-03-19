/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode last = head;

        while (last.next != null) {
            if (last.val == last.next.val) {
                last.next = last.next.next;
            } else {
                last = last.next;
            }
        }
        return head;
    }
}