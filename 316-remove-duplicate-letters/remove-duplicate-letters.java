class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i)-'a']=i;
        }
        boolean[] used=new boolean[26];
        Stack<Character>st=new Stack<>();
        for (int i=0;i<s.length(); i++) {
            char ch=s.charAt(i);
            if (used[ch-'a']) continue;
            while (!st.isEmpty() && st.peek() > ch && last[st.peek()-'a'] > i) {
                 used[st.pop()-'a'] = false;
            }
            st.push(ch);
            used[ch-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }
}