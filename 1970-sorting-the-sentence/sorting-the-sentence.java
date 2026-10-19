class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[]ans= new String[arr.length];
        for(String word:arr){
            int idx=word.charAt(word.length()-1)-'1';
            ans[idx]=word.substring(0,word.length()-1);
        }
        return String.join(" ", ans);
    }
}