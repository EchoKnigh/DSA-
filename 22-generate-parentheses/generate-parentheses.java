class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list= new ArrayList<>();
        fxn("",n,list,0);
        return list;
        
    }
    void fxn(String curr, int n, ArrayList<String>list,int length){
        if(length==2*n){
            if(isvalid(curr))
                list.add(curr);
            
            return ;
        }
        curr+='(';
        fxn(curr, n, list,length+1);
        curr=curr.substring(0,curr.length()-1);
        curr+=')';
        fxn(curr,n,list,length+1);
    }
    boolean isvalid(String curr){
        int n= curr.length();
        int count=0;
        char []arr=curr.toCharArray();
        for( int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                count++;
            }else{
                count--;
            }
            if(count<0)return false;
        }

        return count==0;
    }

}