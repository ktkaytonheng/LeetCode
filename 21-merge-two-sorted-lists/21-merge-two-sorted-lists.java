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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // If any of the 2 lists are empty, return the other list
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        // Create a new list
        // Head is initialized as placeholder
        ListNode head = new ListNode(2);  
        ListNode node = head;
        
        // Have one pointer traverse each list, adding whichever lower value to the new list and then move to 
        // next element
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            }
            else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        
        // Whichever list empties first, add the other list to the tail of new list
        node.next = (l1 == null) ? l2 : l1;
        
        // Return new list
        return head.next;
    }
}