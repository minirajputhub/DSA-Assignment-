import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> printFibb(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        if (n <= 0) return answer;
        answer.add(1);
        if (n == 1) return answer;
        answer.add(1);
        for (int i = 2; i < n; i++) {
            answer.add(answer.get(i - 1) + answer.get(i - 2));
        }
        return answer;
    }
}
