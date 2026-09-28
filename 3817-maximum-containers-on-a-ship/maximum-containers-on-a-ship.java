class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int nofb=n*n;
        for( int  i=nofb;i>=1;i--){
            int bottle=i*w;
            if(bottle<=maxWeight){
                return i;
            }
        }
        return 0;
    }
}