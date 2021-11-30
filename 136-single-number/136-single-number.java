class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int base = 0;
        for (int i=0; i<nums.length; i++) {
            base = base ^ nums[i];
        }
        return base;
    }
}