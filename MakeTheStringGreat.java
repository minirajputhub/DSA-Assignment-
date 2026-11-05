class Solution {
    public String makeGood(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int size = stack.length();
            if (size > 0 && Math.abs(stack.charAt(size - 1) - c) == 32) {
                stack.deleteCharAt(size - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
