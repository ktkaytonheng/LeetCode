class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        
        // The more variables we initialize, the easier the problem gets due to the 
        // amount of information we can store and access. The main idea is the 
        // explanation below at line 17-19
        
        int[] startingIndex = new int[s.length()];
        startingIndex[0] = 0;
        int[] localMax = new int[s.length()];
        localMax[0] = 1;
        int globalMax = 1;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put(s.charAt(0), 0);
        for (int i=1; i<s.length(); i++) {
            // This part is to check if character already exists in hashmap.
            // longest so far: 'abc', next: 'a'
            // new longest: 'bca', new starting index at 'b'
            if (hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) >= startingIndex[i-1]) {
                startingIndex[i] = hm.get(s.charAt(i)) + 1;
                localMax[i] = i - startingIndex[i] + 1;
            }
            else {
                startingIndex[i] = startingIndex[i-1];
                localMax[i] = localMax[i-1] + 1;
            }
            hm.put(s.charAt(i), i);
            globalMax = Math.max(globalMax, localMax[i]);
        }
        return globalMax;
    }
}

//                  a b c a b c b b
// index            0 1 2 3 4 5 6 7
// localMax         1 2 3 3 3 3 2 1
// startingIndex    0 0 0 1 2 3 5 7


