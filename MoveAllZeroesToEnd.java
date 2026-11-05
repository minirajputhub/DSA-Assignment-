class Solution {
    void pushZerosToEnd(int[] arr) {
        int write = 0;
        for (int value : arr) if (value != 0) arr[write++] = value;
        while (write < arr.length) arr[write++] = 0;
    }
}
