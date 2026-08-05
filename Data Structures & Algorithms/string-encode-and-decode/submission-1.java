class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();

    }

   public List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int start = i;

        // Find '#'
        while (str.charAt(i) != '#') {
            i++;
        }

        // Length of the next string
        int len = Integer.parseInt(str.substring(start, i));

        i++; // Skip '#'

        // Extract the string
        res.add(str.substring(i, i + len));

        // Move to the next encoded string
        i += len;
    }

    return res;
}
}
