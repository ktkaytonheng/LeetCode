class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0 || s.length == 1) return;
        
        // Swapping method to reverse
        int left = 0;
        int right = s.length-1;
        while (left != right && left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}