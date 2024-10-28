package Stack;

import java.util.Stack;

public class LongestValidParenthesis {

    // "((()" result = 2;
    public static int maxLength(String s) {
        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();

        // Push -1 as the base for valid substring calculations
        stack.push(-1);

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    // calculate the length of the current valid substring
                    int length = i - stack.peek();
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        return maxLength;
    }

}
