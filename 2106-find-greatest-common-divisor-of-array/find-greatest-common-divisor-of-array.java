class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for( int i=0;i<nums.length;i++){
            a=Math.min(a,nums[i]);
            b=Math.max(b,nums[i]);

        }
        return gcd(a,b);
    }
    public int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}