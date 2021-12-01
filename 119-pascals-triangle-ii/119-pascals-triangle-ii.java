class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Initialize an array that has the length of the rowIndex
        // Update the array as you 'traverse' down the triangle
        Integer[] ans = new Integer[rowIndex+1];
        Arrays.fill(ans, 1);
        
        for (int i=1; i<rowIndex; i++) {
            for (int j=i; j>0; j--) {
                ans[j] = ans[j] + ans[j-1];
            }
        }
        
        return Arrays.asList(ans);
    }
}

// [1,1,1,1,1]
// <->

// [1,1,1,1,1]
// <--->

// [1,2,1,1,1]
// <----->

// [1,3,3,1,1]
// <------->

// [1,4,6,4,1]
// <--------->