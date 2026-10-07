class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int l=0;
        int r=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                l++;
            }else if(c==')'){
                if(l>0){
                    l--;
                }else{
                    r++;
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        Set<String>set = new HashSet<>();
        fxn(0,s,sb,l,r,set);
        return new ArrayList<>(set);
    }
    void fxn(int i,String s,StringBuilder sb,int l, int r,Set<String>set){
        int n=s.length();
        if(i==n){
            if(l==0 && r==0 && isvalid(sb.toString())){
            set.add(sb.toString());
                
            }
            return;
        }
        if(s.charAt(i)=='(' && l>0){
            fxn(i+1,s,sb,l-1,r,set);
        }
        if(s.charAt(i)==')' && r>0){
            fxn(i+1,s,sb,l,r-1,set);
        }
        sb.append(s.charAt(i));
        fxn(i+1,s,sb,l,r,set);
        sb.deleteCharAt(sb.length()-1);
        
    }
    boolean isvalid(String s){
        int balance=0;
        for( int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                balance++;
            }else if(s.charAt(i)==')'){
                balance--;
            }
        if(balance<0){
            return false;
        }
        }
        return balance==0;
    }
}