class Solution {
    public int peakIndexInMountainArray(int[] arr) {    
        // Base condition have to account for if arr is already decreasing to begin with,
        // or if last number is the largest number.
        int len = arr.length;
        if (len == 1 || arr[0] > arr[1]) return 0;
        if (arr[len-1] > arr[len-2]) return len-1;
        // Start pointer and end pointer, traversing towards the middle of the arr and returning
        // if peak is found. For start pointer, condition is to check if next is smaller, and
        // for end pointer, condition is to check if prev is smaller
        return helper(arr, 1, len-2);
    }
    
    public int helper(int[] arr, int start, int end) {
        if (start == end) return start;
        if (start+1 == end) return (arr[end] < arr[start]) ? start : end;
        if (arr[start] > arr[start+1]) return start;
        if (arr[end-1] < arr[end]) return end;
        return helper(arr, start+1, end-1);
    }
}