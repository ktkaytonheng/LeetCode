class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Iterate through letters array and find one greater than target. If not, return first one
        for (char c: letters) {
            if (c > target) return c;
        }
        return letters[0];
        
    }
}