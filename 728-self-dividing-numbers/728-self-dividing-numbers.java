class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i=left; i<=right; i++) {
            if (checkSelfDividing(i)) ans.add(i);
        }
        return ans;
    }
    
    public boolean checkSelfDividing(int val) {
        int temp = val;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == 0) return false;
            if (val % digit != 0) return false;
            temp = temp / 10;
        }
        return true;
    }
}