class Solution {
    public long maxAlternatingSum(int[] nums) {
        long []arr= new long [nums.length];
        for( int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        int k=arr.length/2;
        long ans=0;
        for( int i=0;i<k;i++){
            ans-=arr[i];
        }
        for( int i=k;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;

    }
}