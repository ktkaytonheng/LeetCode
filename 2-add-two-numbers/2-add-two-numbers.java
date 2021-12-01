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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l1.val == 0) return l2;
        if (l2.next == null && l2.val == 0) return l1;
        
        // Luckily, the numbers are stored in reverse order, meaning 2->4->3 actually means 342
        // This way, the carry over for adding 2 numbers that results over 9 can be 'carried' during
        // iteration of the linked lists.
        
        // A special case would be if 1 number has more digits than the other, then we just have to either
        // 1. Add the remaining list (including carry) to l1, if l1 < l2
        // 2. Add just the carry to l1, if l1 > l2
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode last = cur1;
        int carry = 0;
        while (cur1 != null) {
            if (cur1.next == null) last = cur1;
            if (cur1.next == null && cur2 != null && cur2.next != null) {
                cur1.next = cur2.next;
                cur2.next = null;
            }
            cur1.val += carry;
            if (cur2 != null) {
                cur1.val += cur2.val;
                cur2 = cur2.next;
            }
            carry = cur1.val / 10;
            cur1.val = cur1.val % 10;
            cur1 = cur1.next;
        }
        if (carry != 0) {
            last.next = new ListNode(carry);
        }
        return l1;
    }
}

// 2 4 3
// 5 6 4 1
// 7 0 8 1