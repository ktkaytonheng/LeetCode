class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        
        // Same idea as getting the digits from a decimal number
        // -> %10 for digit and /10 to move to next number
        
        // For binary, %2, /2 instead
        for (int i=1; i<ans.length; i++) {
            if (i%2 == 0) ans[i] = ans[i/2];
            else ans[i] = ans[i/2]+1;
        }
        return ans;
    }
}