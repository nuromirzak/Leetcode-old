class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        int n = strs[0].length();

        for (int i = 0; i < n; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}