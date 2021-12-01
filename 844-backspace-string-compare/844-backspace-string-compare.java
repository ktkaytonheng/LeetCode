class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        int bspS = 0;
        int bspT = 0;
        
        // Initialize backspace count for both string
        // Initialize end pointer to traverse the string backwards
        // Every iteration of the while loop, choose one action for one string
        // Order of priority:
        // 1. Checking for backspace
        // 2. If no backspace, and count > 0, start deleting
        // 3. If no backspace and count = 0, check for match and move pointer
        while (i >= 0 || j >= 0) {
            if (i >= 0 && s.charAt(i) == '#') { bspS++; i--; }
            else if (bspS > 0) { bspS--; i--; }
            else if (j >= 0 && t.charAt(j) == '#') { bspT++; j--; }
            else if (bspT > 0) { bspT--; j--; }
            else {
                if (i < 0 || j < 0) return false;
                if (s.charAt(i) != t.charAt(j)) return false;
                i--;
                j--;
            }
        }
        return true;
    }
}