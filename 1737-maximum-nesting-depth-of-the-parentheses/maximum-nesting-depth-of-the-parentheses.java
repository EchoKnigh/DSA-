class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        char[]c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='(' ){
                count++;
            max=Math.max(max,count);
                
            }else if(c[i]==')'){
                    count--;
                }
        }
        return max;
    }
}