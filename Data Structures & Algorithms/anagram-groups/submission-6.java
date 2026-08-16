class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];

            for(int i =0; i<s.length(); i++){
                count[s.charAt(i)-'a']++;
            }
            StringBuilder sb  = new StringBuilder();

            for(int i =0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
            else{
                map.get(key).add(s);
            }
        }
        return new ArrayList(map.values());
        


    }
}

