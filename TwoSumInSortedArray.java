class Solution {
    boolean hasPairWithSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            long sum = (long) arr[left] + arr[right];
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }
}
