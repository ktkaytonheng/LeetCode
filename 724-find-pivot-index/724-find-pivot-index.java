class Solution {
    public int pivotIndex(int[] nums) {
        // Quite a difficult question honestly. Had to lookup solution.
        // Basically, we want to instantiate a left sum that represents the sum of the left
        // elements of the pivot, which will be iterating through the array. The condition
        // to check for is sum - pivot - leftsum = leftsum, since
        // rightSum = sum - pivot - leftsum.
        if (nums.length == 1) return 0;
        
        int sum = 0;
        int lsum = 0;
        
        for (int n: nums) {
            sum += n;   
        }
        for (int i=0; i<nums.length; i++) {
            if (sum - lsum - nums[i] == lsum) return i;
            lsum += nums[i];
        }
        return -1;
    }
}


