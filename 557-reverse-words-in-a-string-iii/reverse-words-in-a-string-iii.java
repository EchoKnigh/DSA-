class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        for(int k = 0; k < arr.length; k++) {
            char[] ch = arr[k].toCharArray();
            int i = 0;
            int j = ch.length - 1;
            while(i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }

            arr[k] = new String(ch);
        }
        return String.join(" ",arr);       
    }
}