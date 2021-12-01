class Solution {
    public boolean isPowerOfTwo(int n) {
        // Power of 2 = 2 multiply by itself n number of times
        // Simple while loop to keep dividing itself by 2 until the end, then check for
        // remainders
        while (n != 1) {
            if (n % 2 != 0 || n == 0) return false;
            n /= 2;
        }
        return true;
    }
}