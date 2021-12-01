class Solution {
    public int findDuplicate(int[] nums) {
        // Floyd's Hare and Tortoise algorithm to find cycle in linked list
        // In this case, the elements serves as index for the next element
        // For e.g. the element 3 would point to index 2 in the array, and
        // element 5 would point to index 4 (0-indexed)
        // If there's a duplicate, there would be a cycle in the 'linked list'
        
        // Watch JomaTech's video 'If Programming was an anime'
        // https://www.youtube.com/watch?v=pKO9UjSeLew
        
        int slow = nums[0];
        int fast = nums[slow];
        
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}