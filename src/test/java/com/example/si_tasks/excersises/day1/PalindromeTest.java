package com.example.si_tasks.excersises.day1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PalindromeTest {

    @Test
    void contextLoads() {
    }

    @Test
    void testPalindromes() {
    
        assert Palindrome.isPalindrome(0);
        assert Palindrome.isPalindrome(1);
        assert Palindrome.isPalindrome(121);
        assert Palindrome.isPalindrome(1221);
        assert Palindrome.isPalindrome(12321);
        assert Palindrome.isPalindrome(123321);
        assert Palindrome.isPalindrome(1234321);
        assert Palindrome.isPalindrome(123454321);
    }

    @Test
    void testNonPalindromes() {
    
        assert !Palindrome.isPalindrome(10);
        assert !Palindrome.isPalindrome(12);
        assert !Palindrome.isPalindrome(123);
        assert !Palindrome.isPalindrome(1234);
        assert !Palindrome.isPalindrome(12345);
        assert !Palindrome.isPalindrome(123456);
        assert !Palindrome.isPalindrome(1234567);
        assert !Palindrome.isPalindrome(12345678);
        assert !Palindrome.isPalindrome(123456789);
    }

    @Test
    void testNegative() {
        
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-1));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-10));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-123));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-1234));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-12345));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-123456));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-1234567));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-12345678));
        assertThrows(IllegalArgumentException.class, () -> Palindrome.isPalindrome(-123456789));
    }
}
