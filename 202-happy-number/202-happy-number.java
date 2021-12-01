class Solution {
    // I solved this question recursively with the use of a HashSet, hence the initialization of HashSet
    // outside of the method. Another way is to initialize the HashSet within the method, and writing a
    // helper function to do the recursion instead. However, that will require passing the HashSet for 
    // every recursion call, hence might take up more memory.
    
    HashSet<Integer> hs = new HashSet<Integer>();
    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (hs.contains(n)) return false;
        else {
            hs.add(n);
            int new_n = 0;
            while (n > 0) {
                new_n += (n % 10) * (n % 10);
                n /= 10;
            }
            return isHappy(new_n);
        }
    }
}