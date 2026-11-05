class Solution {
    void arrayTraversal(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i + 1 < n) System.out.print(" ");
        }
    }
}
