class Solution {
    public int maxSubArray(int[] nums) {
        // If only one element exists, the element is the maximum subarray
        if (nums.length == 1) return nums[0];
        
        // Initialize memoization
        int[] localMax = new int[nums.length];
        localMax[0] = nums[0];
        int globalMax = nums[0];
        
        // Iterate through the array, record localMax and update globalMax based on localMax[i]
        for (int i=1; i<nums.length; i++) {
            localMax[i] = Math.max(nums[i], localMax[i-1]+nums[i]);
            globalMax = Math.max(globalMax, localMax[i]);
        }
        
        return globalMax;
    }
}

// nums         [-2, 1,-3, 4,-1, 2, 1,-5, 4]
// localMax     [-2, 1,-2, 4, 3, 5, 6, 1, 5]
// globalMax     -2, 1, 1, 4, 4, 5, 6, 6, 6

// localMax is set as the larger between itself and itself+prev