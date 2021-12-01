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
    public ListNode deleteDuplicates(ListNode head) {
        // Return null/head if no/one element
        if (head == null || head.next == null) return head;
        
        ListNode node = head;
        
        // Check next element if its the same as current, 
        // if so, link current to next.next
        // else, move to the next node
        while (node != null && node.next != null) {
            while (node.next != null && node.next.val == node.val) {
                node.next = node.next.next;
            }
            node = node.next;
        }
        
        return head;
    }
}