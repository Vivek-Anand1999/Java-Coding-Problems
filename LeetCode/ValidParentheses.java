package LeetCode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}[][";
        boolean result = isValid(s);
        System.out.println(result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if ((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']')
                        || (stack.peek() == '{' && s.charAt(i) == '}')) {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
