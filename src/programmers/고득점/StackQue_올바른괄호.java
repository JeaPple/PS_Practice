package programmers.고득점;

import java.util.Stack;

public class StackQue_올바른괄호 {
    public static void main(String[] args) {
        boolean answer = false;
        String s = "(())(";

        /// start
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                    break;
                } else {
                    stack.pop();
                }
            }
            System.out.println("stack = " + stack);
        }

        if (stack.isEmpty()) {
            answer = true;
        }

        /// end

        System.out.println("answer = " + answer);
    }
}
