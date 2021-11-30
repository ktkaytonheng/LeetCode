class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length-1;
        boolean done = false;
        // Standard carry over method
        while (last >= 0) {
            if (digits[last] == 9) {
                digits[last] = 0;
                last--;
            }
            else {
                digits[last]++;
                break;
            }
        }
        // If had to carry over for first digit, then add a new digit
        if (last == -1) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for (int i=1; i<newDigits.length; i++) {
                newDigits[i] = digits[i-1];
            }
            return newDigits;
        }
        return digits;
    }
}