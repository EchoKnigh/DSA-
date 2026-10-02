class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String answer = "";
        int frequency = 0;

        for (char ch1 : map.keySet()) {
            StringBuilder sb = new StringBuilder();

            for (char ch2 : map.keySet()) {
                if (map.get(ch1).equals(map.get(ch2))) {
                    sb.append(ch2);
                }
            }

            if (sb.length() > answer.length() ||
                (sb.length() == answer.length() && map.get(ch1) > frequency)) {
                answer = sb.toString();
                frequency = map.get(ch1);
            }
        }

        return answer;
    }
}