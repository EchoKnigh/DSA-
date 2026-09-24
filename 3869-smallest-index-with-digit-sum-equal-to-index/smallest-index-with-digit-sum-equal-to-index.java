class Solution {
    public int smallestIndex(int[] nums) {
        int digit=0;
        int sum=0;
        if(nums[0]==0)return 0;
        for( int i=1;i<nums.length;i++){
             sum=0;
            while(nums[i]>0){
                digit=nums[i]%10;
                sum+=digit;
                nums[i]/=10;
            }
               
                if(sum==i){
                    return i;
                }
        }
        return -1;
    }
}