class Solution {
    public boolean containsDuplicate(int[] nums) {
        // This method requires sorting, but the runtime seems to be faster which seems to be against
        // expectation as sorting gives O(nlogn) and HashSet algorithm takes O(n).
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}


// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> hm = new HashSet<Integer>();
        
//         for (int i=0; i<nums.length; i++) {
//             if (!hm.contains(nums[i])) hm.add(nums[i]);
//             else return true;
//         }
//         return false;
//     }
// }

