class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // By changing the value of the array to negative (since constraint state that all elements are +ve)
        // we can mark the values which exist by changing the element at the index = value to negative
        // For e.g. [2,1] -> Visit index 0, element 2 -> 2-1=1 -> Mark index 1, element 1 -> [2,-1]
        // After iterating through 1 and marking all the values, have a separate for loop to check
        // for positive values. The corresponding index of these positive values indicate the missing
        // numbers of the array.
        
        for (int i=0; i<nums.length; i++) {
            int multiplier = (nums[Math.abs(nums[i])-1] < 0) ? 1 : -1;
            nums[Math.abs(nums[i])-1] *= multiplier;
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int j=0; j<nums.length; j++) {
            if (nums[j] > 0) ans.add(j+1);
        }
        
        return ans;
    }
}