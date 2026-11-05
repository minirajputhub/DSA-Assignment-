class Solution {
    static String isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) >= 0 ? "YES" : "NO";
    }
}
