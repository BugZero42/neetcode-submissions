class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), s, 0);
        return res;
    }

    public void backtrack(List<List<String>> res, List<String> tempList, String s, int index) {
        if (index == s.length()) {
            res.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPal(s, index, i)) {
                tempList.add(s.substring(index, i + 1));
                backtrack(res, tempList, s, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public boolean isPal(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}