package com.example.si_tasks.excersises.day1;

public class Palindrome {

    public static boolean isPalindrome(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("The value must be must be a positive integer");
        }

        int reversed = 0;
        int original = n;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
}
