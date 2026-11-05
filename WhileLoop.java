class Solution {
    static void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i);
            if (i < n) System.out.print(" ");
            i++;
        }
    }
}
