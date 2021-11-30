class Solution {
    public boolean isPalindrome(int x) {
        // If number is negative, the '-' makes x a non-palindrome
        if (x < 0) return false;
        // Single digits are considered palindromes
        if (x < 10) return true;
        
        // Approach: To reverse the number and check if its equal the original
        // Example 1: 123 would give 321, which gives false
        // Example 2: 12521 would give 12521, which gives true
        int y = x;
        int temp = 0;
        
        while (x > 0) {
            temp *= 10;
            temp += x % 10;
            x /= 10;
        }
        if (temp == y) return true;
        return false;
    }
}