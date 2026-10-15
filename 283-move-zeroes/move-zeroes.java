class Solution {
    public void moveZeroes(int[] nums) {
        // int i=0;
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]!=0){
        //         nums[i++]=nums[j];
        //     }
        // }
        // while(i<nums.length){
        //     nums[i++]=0;
        // }
        int j=0;
        for( int i=0;i<nums.length;i++){
            if( nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length){
            nums[j++]=0;
        }
    }      
        
    
}