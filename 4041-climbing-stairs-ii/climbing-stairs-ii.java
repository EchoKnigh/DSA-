class Solution {
    public int climbStairs(int n, int[] costs) {
        int []dp=new int [n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3 && i-j>=0 ;j++){
                int cost=dp[i-j]+j*j+costs[i-1];
                dp[i]=Math.min(dp[i],cost);
            }
        }
        return dp[n];


        // return climb(n,costs,dp);
    // }
    // static int climb(int n,int []costs,int []dp){
    //     if(n==0)return 0;
    //     if(dp[n]!=-1)return dp[n];
    //     int ans = Integer.MAX_VALUE;
    //     for(int i=1;i<=3 && n-i>=0;i++){
    //         int currentcost=climb(n-i,costs,dp)+i*i;
    //      ans = Math.min(ans,currentcost+costs[n-1]);

    //     }
    //     return dp[n]=ans;
    }
}