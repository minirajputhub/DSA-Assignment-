class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1, second = -1;
        for (int value : arr) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value < largest && value > second) {
                second = value;
            }
        }
        return second;
    }
}
