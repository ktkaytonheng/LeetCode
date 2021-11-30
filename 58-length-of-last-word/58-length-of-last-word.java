class Solution {
    public int lengthOfLastWord(String s) {
        // If only one character, return 1 if its not a whitespace
        if (s.length() == 1) {
            if (s == " ") return 0;
            else return 1;
        }
        // Use to keep track of whether pointer is on a word
        boolean wordFound = false;
        
        // If last character is not a whitespace, indicate end of word
        if (s.charAt(s.length()-1) != ' ') wordFound = true;
        int len = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                // If wordFound is true, indicate start of word
                if (wordFound) return len;
                
            }
            else {
                // If wordFound is false, indicate end of word
                if (!wordFound) wordFound = true;
                len++;
            }
        }
        return len;
    }
}