class Solution {
    public int strStr(String haystack, String needle) {
        int hS = haystack.length();
        int nS = needle.length();

        if (nS == 0) {
            return 0;
        }


        for (int i = 0; i <= hS - nS; i++) {
            int k = 0;
            while (haystack.charAt(k + i) == needle.charAt(k)) {
                k++;
                if (k == nS) {
                    return i;
                }
            }
        }
        return -1;
    }
}