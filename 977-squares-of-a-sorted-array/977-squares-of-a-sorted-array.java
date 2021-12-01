class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1) {
            int[] ans = new int[1];
            ans[0] = nums[0]*nums[0];
            return ans;
        }
        
        // The solution is slightly long as there are a few cases to account for.
        // For the first loop, initialize 2 pointers at both ends of the arr and 
        // one new arr, and add the square of the element with bigger magnitude 
        // to the end of the new array. Move the pointer of the added element
        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;
        int[] ans = new int[nums.length];
        
        while (nums[i]<0 && nums[j]>=0) {
            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                ans[index] = nums[i] * nums[i];
                i++;
            }
            else {
                ans[index] = nums[j] * nums[j];
                j--;
            }
            index--;
        }
        
        // If any of the pointers hit a '0', check if the other pointer is still on a
        // non-zero. If so, add the square to the new array until i is next to j.
        if (nums[i] >= 0) {
            while (j != i-1) {
                ans[index] = nums[j] * nums[j];
                j--;
                index--;
            }
            return ans;
        }
        if (nums[j] < 0) {
            while (i != j+1) {
                ans[index] = nums[i] * nums[i];
                i++;
                index--;
            }
        }
        return ans;
    }
}