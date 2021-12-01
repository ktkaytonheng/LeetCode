class Solution {
    public List<String> summaryRanges(int[] nums) {
        // When nums have either 1 or 0 elements. Pretty straightforward
        List<String> list = new ArrayList<String>();
        if (nums.length == 0) return list;
        if (nums.length == 1) {
            list.add(String.valueOf(nums[0]));
            return list;
        }
        
        // Good that nums is already sorted, so we don't need to worry about meeting smaller numbers as
        // we iterate through the array. The condition check for the iteration is if the previous number is
        // smaller than the current number by more than 1, which if so, will require a separate range.
        int start = nums[0];
        int end;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]+1) {
                end = nums[i-1];
                // This ternary operator will help differentiate between single elements such as "7" and
                // a range of elements such as "7->9"
                String ans = (start == end) ? String.valueOf(start) : String.valueOf(start) + "->" + String.valueOf(end);
                list.add(ans);
                start = nums[i];
            }
        }
        // Since our for loop checks for the current number > previous number, we need to close off the last string
        end = nums[nums.length-1];
        String ans = (start == end) ? String.valueOf(start) : String.valueOf(start) + "->" + String.valueOf(end);
        list.add(ans);
        return list;
    }
}