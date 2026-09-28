class Solution {
    public int finalElement(int[] nums) {
        if(nums[nums.length-1]>nums[0]){
            return nums[nums.length-1];

        }
        return nums[0];
    }
}