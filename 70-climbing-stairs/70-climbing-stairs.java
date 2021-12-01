class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int p1 = 2;
        int p2 = 1;
        
        // Use Fibonacci Sequence to compute the answer at n
        for (int i=3; i<n+1; i++) {
            int temp = p1 + p2;
            p2 = p1;
            p1 = temp;
        }
        
        return p1;
    }
}