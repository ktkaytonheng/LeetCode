class Solution {
    public boolean isPalindrome(String s) {
        // Convert to array
        char[] c = s.toCharArray();
        
        // Special for loop that initialize 2 pointers, changing the pointer value
        // WITHIN the for loop
        // The rest pretty self-explanatory
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
                return false;
        }
        return true;
    }
}