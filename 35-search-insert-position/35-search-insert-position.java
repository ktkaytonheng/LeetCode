class Solution {
    public int searchInsert(int[] nums, int target) {
        // O(log n) runtime basically mean binary search
        // Base case if only 1 element
        if (nums.length == 1) {
            if (nums[0] == target || nums[0] > target) return 0;
            else return 1;
        }
        // Target is on either side of the array
        if (target < nums[0]) return 0;
        if (target > nums[nums.length-1]) return nums.length;
        
        // Binary search algorithm
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        
        while (mid != left && mid != right) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid;
            else if (nums[mid] > target) right = mid;
            mid = (left+right)/2;
        }
        if (nums[mid] < target) return mid+1;
        else return mid;
    }
}