class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                int sub=nums[i]-min;
                ans=Math.max(ans,sub);
            }
            min = Math.min(min, nums[i]);
        }
        return ans;
    }
}