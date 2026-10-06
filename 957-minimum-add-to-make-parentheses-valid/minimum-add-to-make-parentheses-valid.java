class Solution {
    public int minAddToMakeValid(String s) {
        char[]c=s.toCharArray();
        int  bracket=0;
        int closebracket=0;
        for( int i=0;i<c.length;i++){
            if(c[i]=='('){
                bracket++;
               
            }else{
                if(bracket>0){
                    bracket--;
                    
                }else{
                    closebracket++;
                }
                
                
            }

        }
        return bracket+closebracket;
    }
}