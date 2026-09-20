class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        int l=0;
        int r=s.length()-1;
        char[]c=s.toCharArray();
        int []freq=new int [128];
        for(int i=0;i<c.length;i++){
            if(vowel(c[i])){
                freq[c[i]]++;
            }
        }
        int index=0;
        for(int i=0;i<c.length;i++){
            if(!vowel(c[i])){
                sb.append(c[i]);
            }else{
                while(index<=128 && freq[index]==0){
                    index++;
                }
                sb.append((char)index);
                freq[index]--;
            }
        }
        return sb.toString ();
         
    }
    boolean vowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }
}