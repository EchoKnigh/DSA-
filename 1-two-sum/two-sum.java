class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // int i=0;
        // while(i<n-1){
        //     if(nums[i]+nums[i+1]==target){
        //         return new int []{i,i+1};
        //     }
        //     else{
        //         i++;


        //     }
        // }
         HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<=nums.length;i++) {
            int j = target-nums[i];

            if(map.containsKey(j)) {
                return new int[] {map.get(j),i};
            }
            map.put(nums[i], i);
        }    
         return new int[]{};
    }
}