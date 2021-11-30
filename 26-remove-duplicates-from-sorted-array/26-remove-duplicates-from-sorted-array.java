class Solution {
    public int removeDuplicates(int[] nums) {
        // count of duplicates
        int index = 0;
        
        // From second element onwards,
        // if it equals the previous element, continue
        // else, increment index, and set element at index to current element
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
}

// [0,0,1,1,1,2,2,3,3,4]
//  x ^
    
// [0,1,1,1,1,2,2,3,3,4]
//    x ^

// [0,1,2,1,1,2,2,3,3,4]
//      x     ^

// [0,1,2,3,1,2,2,3,3,4]
//        x       ^

// [0,1,2,3,4,2,2,3,3,4]
//          x         ^
// <-------->