class Solution {
    public int[] productExceptSelf(int[] nums) {
        // First, we initialize the answer array with first element being 1.
        // To visualize the solution for this problem, the iteration will be travelling from
        // left to right in the array, then back to the left. For each iteration, we will be 
        // multiplying the value of the previous element in both the answer array and the 
        // original array.
        
        int[] ans = new int[nums.length];
        ans[0] = 1;
        int right = 1;
        
        for (int i=1; i<nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        for (int i=nums.length-1; i>=0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}

// [1,2,3,4]
// [1,1,2,6]
// [24,12,8,6]
