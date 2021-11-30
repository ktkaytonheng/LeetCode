class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use of Hashmap to iterate through array once
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        // If number exists in Hashmap, the target pair is found
        // Else, store target-nums[i] into Hashmap as key and i as value
        for (int i=0; i<nums.length; i++) {
            if (hm.containsKey(target-nums[i])) return new int[] {i, hm.get(target-nums[i])}; 
            hm.put(nums[i], i);
        }
        
        return new int[] {0, 0};
    }
}