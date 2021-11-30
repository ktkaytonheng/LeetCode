class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If there is only one string, that string would be the longest prefix
        if (strs.length == 1) return strs[0];
        
        int index = -1;
        boolean match = true;
        
        // while loop iterates through every character of the longest prefix
        // for loop iterates through every string in array
        while (match) {
            index++;
            for (int i=0; i<strs.length; i++) {
                // If any strings happen to be empty, the longest prefix would be empty as well
                if (strs[i] == "") return "";
                // Return the shortest string provided its still matching with other strings
                if (index == strs[i].length()) return strs[i];
                // First condition checks whether its the first string to prevent null pointer
                // Second condition breaks the for loop if strings start to mismatch
                if (i-1 >= 0 && strs[i].charAt(index) != strs[i-1].charAt(index)) {
                    match = false;
                    break;
                }
            }
        }
        return strs[0].substring(0, index);
    }
}