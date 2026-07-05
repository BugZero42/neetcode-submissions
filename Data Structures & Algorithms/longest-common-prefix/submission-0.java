class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
    
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        StringBuilder res = new StringBuilder();

        for(int i = 0; i < first.length; i++){
            if(first[i]==last[i]){
                res.append(first[i]);
            }
            else{
                break;
            }
        }

        return res.toString();
    
        
    }
}