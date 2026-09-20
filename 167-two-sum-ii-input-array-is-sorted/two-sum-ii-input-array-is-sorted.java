class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int sum=0;
        HashMap<Integer,Integer>map= new HashMap<>();
        for( int i=0;i<n;i++){
            sum=target-nums[i];
            if(map.containsKey(sum)){
                return new int[]{map.get(sum)+1,i+1};
            }
            map.put(nums[i],i);
        }
        return new int []{-1,-1};
    }
}