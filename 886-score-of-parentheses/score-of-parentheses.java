class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } else {
                int inside = st.pop();

                if (inside == 0)
                    inside = 1;
                else
                    inside *= 2;

                st.push(st.pop() + inside);
            }
        }

        return st.peek();
    }
}