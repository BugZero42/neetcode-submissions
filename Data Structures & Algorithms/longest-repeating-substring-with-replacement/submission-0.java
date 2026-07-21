class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int left = 0;
        int[] freq = new int[26];
        int window = 0;
        int maxWindow = 0;

        for(int right = 0; right<s.length(); right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);
            window = right - left + 1;

            if(window-maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
                window = right - left + 1;
            }
            maxWindow = Math.max(window,maxWindow);
        }
        return maxWindow;   
    }
}
