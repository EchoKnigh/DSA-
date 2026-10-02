class Solution {
    public int distinctPoints(String s, int k) {
        int n=s.length();
        int []x=new int[n+1];
        int []y= new int [n+1];
        for( int i=0;i<n;i++){
            x[i+1]=x[i];
            y[i+1]=y[i];
            if(s.charAt(i)=='U'){
                y[i+1]++;
            }else if(s.charAt(i)=='D'){
                y[i+1]--;

            }else if(s.charAt(i)=='L'){
                x[i+1]--;
            }else{
                x[i+1]++;
            }

        }
        HashSet<String> set = new HashSet<>();
        for( int i=0;i<=n-k;i++){
            int fx=x[i]+(x[n]-x[i+k]);
            int fy=y[i]+(y[n]-y[i+k]);
            set.add(fx+","+fy);
        }
        return set.size();
    }
}