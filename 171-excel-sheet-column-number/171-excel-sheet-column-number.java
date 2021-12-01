class Solution {
    public int titleToNumber(String columnTitle) {
        int i = 0;
        int ptr = columnTitle.length()-1;
        int num = 0;
        
        // Its like a hexadecimal conversion to decimal, but instead of dividing by 16, 
        // you use a pointer to 'traverse' the string
        while (ptr >= 0) {
            num += ((int)(columnTitle.charAt(ptr)-'A') + 1) * Math.pow(26,i);
            i++;
            ptr--;
        }
        return num;
    }
}