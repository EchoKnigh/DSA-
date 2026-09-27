class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        HashMap<String,Integer> freq = new HashMap<>();
        int maxF = 0, equal = 0;
        for(int i = 1; i < nums.length; i++){
            int s = Math.min(nums[i],nums[i-1]), l = Math.max(nums[i],nums[i-1]);
            if(s == l) equal++;
            else{
                String key = s+","+l;
                freq.put(key,freq.getOrDefault(key,0)+1);
                maxF = Math.max(maxF,freq.get(key));
            }
        }
        return maxF+equal;
    }
}