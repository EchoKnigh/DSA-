class Solution {
    public int peakValleyDifference(int[] nums) {
        int pick=0;
        int vally=0;
        int ans=0;
        for( int i=1;i<nums.length-1;i++){
            if( nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                pick+=nums[i];
            }
        }
        for( int i=1;i<nums.length-1;i++){
            if( nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                vally+=nums[i];
            }
        }
        return ans=pick-vally;
    }
}