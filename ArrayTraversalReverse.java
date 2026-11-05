class Solution {
    void arrayTraversalReverse(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(" ");
        }
    }
}
