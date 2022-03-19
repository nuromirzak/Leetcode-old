class Solution {
    public int romanToInt(String s) {
        final HashMap<Character, Integer> romans = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i >= 1 && romans.get(s.charAt(i)) > romans.get(s.charAt(i - 1))) {
                result += romans.get(s.charAt(i)) - romans.get(s.charAt(i - 1));
                i--;
            } else {
                result += romans.get(s.charAt(i));
            }
        }
        return result;
    }
}