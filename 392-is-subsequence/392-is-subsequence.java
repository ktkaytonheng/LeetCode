class Solution {
    public boolean isSubsequence(String s, String t) {
        // Initialize pointer for both strings
        // In while loop, always increment pointer for t, and increment pointer for s when
        // the char at s pointer == char at t pointer
        
        if (s.length() == 0) return true;
        else if (t.length() == 0) return false;
        int sPtr = 0;
        int tPtr = 0;
        
        while (sPtr < s.length() && tPtr < t.length()) {
            if (s.charAt(sPtr) == t.charAt(tPtr)) sPtr++;
            tPtr++;
        }
        
        if (sPtr == s.length()) return true;
        else return false;
        
    }
}