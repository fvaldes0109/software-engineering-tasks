package com.example.si_tasks.excersises.day1;

import java.util.Stack;

public class Brackets {

    public static boolean isBalanced(String str) {

        // Valid characters are '(', ')', '[', ']', '{', '}'

        // Check for invalid characters
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c != '(' && c != ')' && c != '[' && c != ']' && c != '{' && c != '}') {
                throw new IllegalArgumentException("Invalid character: " + c);
            }
        }

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                else if (c == ']' && top != '[') return false;
                else if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
