class Solution {
    public int countIntersectingIntervals(int[][] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for( int j=i+1;j<nums.length;j++){
                int s1=nums[i][0];
                int e1=nums[i][1];
                int s2=nums[j][0];
                int e2=nums[j][1];
                if(s1<=e2 && s2<=e1){
                    count++;
                }
            }

        }
        return count;
    }
}