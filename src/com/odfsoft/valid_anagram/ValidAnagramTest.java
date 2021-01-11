package com.odfsoft.valid_anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    public void test1() {
        boolean result = new ValidAnagram().isAnagram("anagram", "nagaram");

        assertTrue(result);
    }

    @Test
    public void test2() {
        boolean result = new ValidAnagram().isAnagram("rat", "car");

        assertFalse(result);
    }

}