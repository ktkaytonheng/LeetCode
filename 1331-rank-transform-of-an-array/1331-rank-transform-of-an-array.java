class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Initialize a copy of the arr, then sort the copy
        // iterate through the sorted copy, keeping track of the rank of the element
        // iterate through the original arr, then update the copy at the same index
        // with the rank in the hashmap
        if (arr.length == 0) return arr;
        if (arr.length == 1) return new int[]{1};
        int[] temp = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int rank = 1;
        for (int x: temp) {
            if (!hm.containsKey(x)) hm.put(x, rank++);
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}

// Treemap solution, 16% Time 55% Space
// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
//         for (int i=0; i<arr.length; i++) {
//             tmap.put(arr[i], 1);
//         }
//         int rank = 1;
//         for (int x: tmap.keySet()) {
//             tmap.put(x, rank);
//             rank++;
//         }
//         int[] ans = new int[arr.length];
//         for (int i=0; i<arr.length; i++) {
//             ans[i] = tmap.get(arr[i]);
//         }
        
//         return ans;
//     }
// }