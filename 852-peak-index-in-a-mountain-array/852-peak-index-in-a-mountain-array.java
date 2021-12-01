class Solution {
    public int peakIndexInMountainArray(int[] arr) {    
        int len = arr.length;
        if (len == 1 || arr[0] > arr[1]) return 0;
        if (arr[len-1] > arr[len-2]) return len-1;
        
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