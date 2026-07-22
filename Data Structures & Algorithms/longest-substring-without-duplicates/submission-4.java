class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;

        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
            maxLen = Math.max(maxLen,r-l);
        }
        return maxLen;
    }
}
