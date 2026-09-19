class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map= new HashMap<>();
        char []c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
         List<Character>list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();

        for (char ch:list) {
            for (int i=0;i<map.get(ch);i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}