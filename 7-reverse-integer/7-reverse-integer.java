class Solution {
    public int reverse(int x) {
        // Cheaty way by converting it into string, reversing it, then convert it back
        // to integer. If the number was negative, multiply it with -1. If it give an
        // error for being out of range, return 0
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}