class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.length()==0) return 0;
        int r = 0;
        int l = 0;
        int maxlen = 0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                maxlen = Math.max(maxlen,r-l);
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}
