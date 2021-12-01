class Solution {
    public int getMaximumGenerated(int n) {
        if (n <= 1) return n;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        
        // Initialize array with length n+1, and update the arr accordingly as you iterate through
        // with the rules provided. The only thing to add is a 'global' variable max and update it
        // if the current element of the array is greater.
        
        for (int i=2; i<n+1; i++) {
            if (i%2 == 0) arr[i] = arr[i/2];
            else arr[i] = arr[i/2] + arr[i/2+1];
            max = Math.max(arr[i], max);
        }
        return max;
    }
}