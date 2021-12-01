class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            for (int i=0; i<n; i++) {
                nums1[i] = nums2[i];
            }
        }
        int i = m-1;
        int j = n-1;
        int index = m+n-1;
        
        // Have one pointer iterate each array from the end, adding the larger value to the end of nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[index] = nums1[i];
                i--;
            }
            else {
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
        
        // If there are remaining elements in nums1 or nums2, continue adding them to nums1
        while (i >= 0) {
            nums1[index] = nums1[i];
            i--;
            index--;
        }
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }
    }
}