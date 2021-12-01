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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Use Floyd's Hare and Tortoise algorithm to find length of linkedlist
        // If n < middle of linked list, start from head again
        // Else, continue from slow
        
        if (head.next == null) return null;
        if (head.next.next == null) {
            if (n == 1) head.next = null;
            else if (n == 2) head = head.next;
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        int len = 2;

        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            len++;
            if (fast != null) len++;
        }
        
        int steps = len - n;
        if (steps == 0) head = head.next;
        else {
            slow = head;
            while (steps != 1) {
                slow = slow.next;
                steps--;
            }
            slow.next = slow.next.next;
        }
        return head;
    }
}

// 1 2 3 4 5 n
// s f
//   s   f
//     s     f
// len = 5, steps = 1
// 1 2 3   5 n