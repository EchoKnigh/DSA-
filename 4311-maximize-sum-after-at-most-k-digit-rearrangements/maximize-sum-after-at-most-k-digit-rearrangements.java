class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum=0;
        int n=nums.length;
        long[]gain=new  long[n];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int num=nums[i];

            int[]freq=new int[10];

            while(num>0){
                freq[num%10]++;
                num/=10;
            }
            long rearranged=0;

            for(int d=9;d>=0;d--){
                while(freq[d]>0){
                    rearranged=rearranged*10+d;
                    freq[d]--;
                }
            }
                gain[i]=rearranged-nums[i];
            }
            Arrays.sort(gain);
            for( int j=n-1;j>=n-k;j--){
                if(gain[j]>0){
                    sum+=gain[j];
                }
            }
        
            return sum;
        
    }
}