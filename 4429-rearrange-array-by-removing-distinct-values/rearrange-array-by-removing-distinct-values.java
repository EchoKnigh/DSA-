class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>list= new ArrayList<>();
        HashMap<Integer,Integer>map= new HashMap<>();
        for( int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

       while(!map.isEmpty()){
        ArrayList<Integer>keys= new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(int num:keys){
            list.add(num);

            int freq= map.get(num);
            if(freq==1){
                map.remove(num);

            }else{
                map.put(num,freq-1);
            }
        }

       }

        int []ans= new int [list.size()];
        for( int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}