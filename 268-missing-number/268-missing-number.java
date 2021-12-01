class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length+1) / 2;
        
        // Math solution that's possible due to constraints
        // Sum of 1 to n is given by n(n+1)/2
        // Since technically 1 number if replaced by 0, we can just take the sum
        // of 1 to n, subtract every element from the sum and we can obtain the answer.
        for (int i=0; i<nums.length; i++) {
            sum -= nums[i];
        }
    
        return sum;
    }
}