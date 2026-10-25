class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int j=0;
        long count=0;
        long sub=0;
        for( int i=0;i<nums.length;i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                count+=1;
                sub+=count;

            }else{
                count=0;
            }
            
            
        }
        return sub;
    }
}