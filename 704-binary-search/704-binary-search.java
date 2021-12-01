class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) return (nums[0] == target) ? 0 : -1;
        
        // Typical binary search algorithm
        int middleIndex = nums.length/2;
        if (nums[middleIndex] == target) return middleIndex;
        else {
            if (nums[middleIndex] < target) {
                int ans = search(Arrays.copyOfRange(nums, middleIndex, nums.length), target);
                return (ans == -1) ? -1 : ans + middleIndex;
            }
            else {
                return search(Arrays.copyOfRange(nums, 0, middleIndex), target);
            }
        }
    }
}