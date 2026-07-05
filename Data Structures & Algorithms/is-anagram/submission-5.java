class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> x = new HashMap<>();
        HashMap<Character,Integer> y = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i< s.length(); i++){
            x.put(s.charAt(i),x.getOrDefault(s.charAt(i),0)+1);
            y.put(t.charAt(i),y.getOrDefault(t.charAt(i),0)+1);
        }

        if(x.equals(y)){
            return true;
        }
        else {
            return false;
        }


    }
}
