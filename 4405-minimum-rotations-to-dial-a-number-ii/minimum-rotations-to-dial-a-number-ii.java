class Solution {
    public int minRotations(int n, String s) {
        int sum = distance('0', s.charAt(0));
        for (int i = 1; i < n; i++) {
            sum += distance(s.charAt(i - 1), s.charAt(i));
        }
        int result = sum;
        for (int k = 0; k < n; k++) {
            int cost = sum;
            if (k == 0) {
                cost -= distance('0', s.charAt(0));
                cost += distance('0', s.charAt(n - 1));
            } else {
                cost -= distance(s.charAt(k - 1), s.charAt(k));
                cost += distance(s.charAt(k - 1), s.charAt(n - 1));
            }
            result = Math.min(result, cost);
        }
        return result;
    }

    int distance(char a, char b) {
        int diff = Math.abs(a - b);
        return Math.min(diff, 10 - diff);
    }
}