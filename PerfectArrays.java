class Solution {
    public boolean isPerfect(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
        return true;
    }
}
