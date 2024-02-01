package com.example.si_tasks.excersises.day1;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BracketsTest {

    @Test
    public void testIsBalanced() {

        assert Brackets.isBalanced("");
        assert Brackets.isBalanced("()");
        assert Brackets.isBalanced("[]");
        assert Brackets.isBalanced("{}");

        assert Brackets.isBalanced("()[]{}");
        assert Brackets.isBalanced("([{}])");
        assert Brackets.isBalanced("([]{})");
        assert Brackets.isBalanced("([{}])");
        assert Brackets.isBalanced("([{}])");
        assert Brackets.isBalanced("((([])))");
        assert Brackets.isBalanced("((([{}]))())");
    }

    @Test
    public void testIsNotBalanced() {

        assert !Brackets.isBalanced("(");
        assert !Brackets.isBalanced("[");
        assert !Brackets.isBalanced("{");
        assert !Brackets.isBalanced(")");
        assert !Brackets.isBalanced("]");
        assert !Brackets.isBalanced("}");

        assert !Brackets.isBalanced(")(");
        assert !Brackets.isBalanced("][");
        assert !Brackets.isBalanced("}{");

        assert !Brackets.isBalanced("(]");
        assert !Brackets.isBalanced("([)]");
        assert !Brackets.isBalanced("{([)}]");
        assert !Brackets.isBalanced("([{}])(");
    }

    @Test
    public void testInvalidCharacters() {
    
        assertThrows(IllegalArgumentException.class, () -> Brackets.isBalanced("a"));
        assertThrows(IllegalArgumentException.class, () -> Brackets.isBalanced("()k"));
        assertThrows(IllegalArgumentException.class, () -> Brackets.isBalanced("()[]{}-"));
        assertThrows(IllegalArgumentException.class, () -> Brackets.isBalanced("()[]{}+()[]{}"));
    }
}
