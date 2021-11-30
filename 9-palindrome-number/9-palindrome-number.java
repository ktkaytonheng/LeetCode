class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        
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