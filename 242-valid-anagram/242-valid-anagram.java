class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        // Basic idea is to store character and their count in the string in a hashmap
        // For the other string, iterate and decrement count of character from HashMap
        for (int i=0; i<s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            else hm.put(s.charAt(i), 1);
        }
        for (int j=0; j<t.length(); j++) {
            if (!hm.containsKey(t.charAt(j))) return false;
            else if (hm.get(t.charAt(j)) == 0) return false;
            else hm.put(t.charAt(j), hm.get(t.charAt(j))-1);
        }
        return true;
    }
}