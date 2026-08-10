class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int high = 0;
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        while(high<s.length()){
            if(set.contains(s.charAt(high))){
                set.remove(s.charAt(low++));
            }
            else{
                set.add(s.charAt(high++));
            }
            maxLen = Math.max(maxLen, high-low);
        }
        return maxLen;
    }
}
