class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // if they have a GCD string, str1+str2 must equal str2+str1
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        return str1.substring(0, gcd);  // GCD string is first 'gcd' characters
    }
}