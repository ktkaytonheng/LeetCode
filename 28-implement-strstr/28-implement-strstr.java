class Solution {
    public int strStr(String haystack, String needle) {
        // Honestly, it pisses me off that there is a problem which a Java library can solve in one line.
        // Especially when that one-liner do so much better than my own long-ass solution. TT
        // Well, treat it as a lesson and move on I guess.
        return haystack.indexOf(needle);
    }
}

// 1370ms 25%, 39mb 62%
//         if (needle.equals("")) return 0;
//         if (needle.length() > haystack.length()) return -1;
//         int needleLen = needle.length();
//         for (int i=0; i<haystack.length()-needleLen+1; i++) {
//             if (haystack.charAt(i) == needle.charAt(0)) {
//                 if (needleLen == 1) return i;
//                 int j = 1;
//                 while (j < needleLen) {
//                     if (haystack.charAt(i+j) != needle.charAt(j)) {
//                         break;
//                     }
//                     j++;
//                 }
//                 if (j == needleLen) return i;
//             }
//         }
//         return -1;