class Solution {
    public boolean isPowerOfTwo(int n) {

        //brute force 
        // if(n==0){
        //     return false;
        // }
        // while(n!=1){
        //     if(n%2!=0){
        //         return false;
        //     }
        //     else{
        //         n=n/2;
        //     }
        // }
        // return true;

        //bitmanipulation

        if(n<=0)return false;
        return (n & (n-1))==0;
    }

}