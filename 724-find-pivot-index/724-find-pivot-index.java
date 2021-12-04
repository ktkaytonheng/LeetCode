class Solution {
    public int pivotIndex(int[] nums) {
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


