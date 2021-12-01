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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        // Floyd's Hare and Tortoise to find the middle of the linked list.
        // While the slow and fast are travelling, the slow pointer reverses the first half of
        // the linked list as well, so that when we start the two pointers in the middle, the first
        // pointer travels to the start and the other travels to the end.
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // s    f
        
        // 1 <- 2 <- 3    4 -> 5 -> 6
        //           s              f
        
        // 1 <- 2 <- 3    4 -> 5 -> 6
        //       <- p1   p2 ->
        // We can check for palindrome this way
        
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode next = head.next;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            slow.next = prev;
            prev = slow;
            slow = next;
            next = next.next;
            fast = fast.next.next;
        }
        
        slow.next = prev;
        if (fast == null) slow = slow.next;
        
        while (next != null) {
            if (slow.val != next.val) return false;
            slow = slow.next;
            next = next.next;
        }
        
        return true;  
    }
}