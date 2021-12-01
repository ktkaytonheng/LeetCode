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
        // If head is null or only one node, no cycle
        if (head == null || head.next == null) return false;
        
        // Floyd's hare and tortoise algorithm
        // Used for finding cycles or middle of linked list
        // In a list with no cycle, the fast will never meet slow, 
        // hence if the fast reaches the end, return false
        // If it manages to meet slow, return true
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null) {
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}