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
    public ListNode removeElements(ListNode head, int val) {
        // If linkedlist is empty, there's nothing to remove
        if (head == null) return null;
        
        // If the list starts with the val, remove the head till null or a node that is not equal val
        while (head.val == val) {
            if (head.next != null) head = head.next;
            else return null;
        }
        
        // For the remaining nodes, check if next node = val
        // If so, point current node to next next node
        // Else, move to next node
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                continue;
            }
            else cur = cur.next;
        }
        return head;
    }
}