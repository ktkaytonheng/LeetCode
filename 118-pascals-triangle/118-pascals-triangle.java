class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Pascal triangle has a formula, so all you had to do was follow the formula
        // The number of elements per level = level
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        // i = level
        // j = element at each level
        for (int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j=0; j<i+1; j++) {
                // First 3 elements of the triangle = 1
                if (j == 0 || j == i || i == 1) {
                    row.add(1);
                }
                // Else, element at i at j = (element at i-1 at j-1) + (element at i-1 at j)
                else {
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        
        return ans;      
    }
}