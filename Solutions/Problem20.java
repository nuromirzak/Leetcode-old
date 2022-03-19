class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.empty()) {
                char last = stack.peek();
                if (last == '(' && c == ')') {
                    stack.pop();
                } else if (last == '[' && c == ']') {
                    stack.pop();
                } else if (last == '{' && c == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}