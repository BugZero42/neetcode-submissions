public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character,Integer> x = new HashMap<>();
        HashMap<Character,Integer> y = new HashMap<>();

        for(char c : s.toCharArray()){
            x.put(c,x.getOrDefault(c,0)+1);
        }
        for(char d : t.toCharArray()){
            y.put(d,y.getOrDefault(d,0)+1);
        }

        return x.equals(y);

    }
}
