class Solution {
    public int removeElement(int[] nums, int val) {
        // Return if empty array
        if (nums.length == 0) return 0;
        
        // Have an index pointer to keep track of position of 'new' array
        // If nums[i] == val, ignore
        // Else, set nums[index] as current element and increment index
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

// For example, given [3,2,2,3] and target = 3,

// [3,2,2,3] 
//  ^
//  x

// [2,2,2,3] 
//    ^
//  x

// [2,2,2,3]
//      ^
//    x

// [2,2,2,3]
//        ^
//      x