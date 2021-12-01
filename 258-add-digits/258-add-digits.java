class Solution {
    public int addDigits(int num) {
        // Math solution. Apparently, the answer is the remainder after dividing by 9.
        // IF the remainder = 0, the ans is 9. *shrugs*
        if (num == 0) return 0;
        else {
            num = num % 9;
            if (num == 0) return 9;
            else return num;
        }
    }
}

// 38 - 11 - 2
// 72 - 9
// 68 - 14 - 5
// 99 - 18 - 9
// 