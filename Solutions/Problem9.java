class Solution {
    public boolean isPalindrome(int x) {
        int n = 0, target = x;
        int sum = 0;

        while (x > 0) {
            n = x % 10;
            sum = sum * 10 + n;
            x /= 10;
        }

        return sum = target;
    }
}