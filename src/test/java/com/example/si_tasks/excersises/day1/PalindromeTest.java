package com.example.si_tasks.excersises.day1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PalindromeTest {

    @Test
    void contextLoads() {
    }

    @Test
    void testPalindromes() {
    
        assert Palindrome.IsPalindrome(0);
        assert Palindrome.IsPalindrome(1);
        assert Palindrome.IsPalindrome(121);
        assert Palindrome.IsPalindrome(1221);
        assert Palindrome.IsPalindrome(12321);
        assert Palindrome.IsPalindrome(123321);
        assert Palindrome.IsPalindrome(1234321);
        assert Palindrome.IsPalindrome(123454321);
    }

    @Test
    void testNonPalindromes() {
    
        assert !Palindrome.IsPalindrome(10);
        assert !Palindrome.IsPalindrome(12);
        assert !Palindrome.IsPalindrome(123);
        assert !Palindrome.IsPalindrome(1234);
        assert !Palindrome.IsPalindrome(12345);
        assert !Palindrome.IsPalindrome(123456);
        assert !Palindrome.IsPalindrome(1234567);
        assert !Palindrome.IsPalindrome(12345678);
        assert !Palindrome.IsPalindrome(123456789);
    }

    @Test
    void testNegative() {
    
        try {
            Palindrome.IsPalindrome(-1);
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }
}
