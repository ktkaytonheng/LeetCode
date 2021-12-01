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
        // If head = null or is a single element, return head
        if (head == null || head.next == null) return head;
        
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = cur.next;
        
        // Instantiate 3 pointers, cur, next and prev
        // Make cur point to prev, then move the 3 pointers forward
        // Visualization can be seen below the solution
        // Initialize last cur as new head
        while (cur != null && cur.next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = cur.next;
        }
        cur.next = prev;
        
        return cur;
    }
}

// null -> 1 -> 3 -> 2 -> 5 -> 9 -> 2 -> 1 -> null
//  p      c    n

// null <- 1    3 -> 2 -> 5 -> 9 -> 2 -> 1 -> null
//         p    c    n

// null <- 1 <- 3    2 -> 5 -> 9 -> 2 -> 1 -> null
//              p    c    n

// null <- 1 <- 3 <- 2    5 -> 9 -> 2 -> 1 -> null
//                   p    c    n

// Continue until end 

// null <- 1 <- 3 <- 2 <- 5 <- 9 <- 2 <- 1 -> null
//                                  p    c    n
//                                    newHead