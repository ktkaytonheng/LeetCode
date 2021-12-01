class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        
        // Mark the elements at the indices which equal the value of the current index
        // If the value of the index is already marked, append it to the ans list.
        
        if (nums.length == 1) {
            return ans;
        } 
        
        for (int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
            else {
                ans.add(Math.abs(nums[i]));
            }
        }
        return ans;
    }
}