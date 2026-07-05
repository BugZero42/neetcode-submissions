class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0,r=0,res=0;

        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                res = Math.max(res,r-l);
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;   
    }
}
