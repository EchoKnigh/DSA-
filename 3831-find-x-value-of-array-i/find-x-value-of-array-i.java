class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n=nums.length;

        long[] result=new long[k];
        long[] prevcount=new long[k];

        for (int i=0;i<n;i++) {

            //index i par end hone waale all subarrays
            long[] currcount = new long[k];

            int currcountelementreminder=nums[i]%k;
            currcount[currcountelementreminder]++;

            for (int oldrem=0;oldrem<=k-1;oldrem++) {
                int newreminder=(int)(((long)oldrem*nums[i]%k)%k);

                currcount[newreminder]+=prevcount[oldrem];
            }

            prevcount=currcount;

            for (int x=0;x<=k-1;x++) {
                result[x]+=prevcount[x];
            }
        }

        return result;
    }
}