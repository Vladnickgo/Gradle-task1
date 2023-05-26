package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    @Test
    void testIsPositiveNumber() {

        assertTrue(StringUtil.isPositiveNumber("123"));
    }
    @Test
    void testIsNegativeNumber() {
        assertFalse(StringUtil.isPositiveNumber("-123"));
    }
    @Test
    void testIsNullValue() {
        assertFalse(StringUtil.isPositiveNumber(null));
    }


}