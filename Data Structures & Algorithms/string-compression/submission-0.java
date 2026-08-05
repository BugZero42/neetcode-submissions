class Solution {
    public int compress(char[] chars) {
        int l = 0;
        int count = 1;
        char curr = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == curr) {
                count++;
            } else {
                chars[l++] = curr;

                if (count > 1) {
                    String cnt = Integer.toString(count);
                    for (char c : cnt.toCharArray()) {
                        chars[l++] = c;
                    }
                }

                curr = chars[i];
                count = 1;
            }
        }

        // Process the last group
        chars[l++] = curr;
        if (count > 1) {
            String cnt = Integer.toString(count);
            for (char c : cnt.toCharArray()) {
                chars[l++] = c;
            }
        }

        return l;
    }
}
