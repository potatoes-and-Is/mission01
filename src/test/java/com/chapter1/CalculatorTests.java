package com.chapter1;

import day1.variable.activity.lesson.SimpleCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    void 공백제거() {
        String result = SimpleCalculator.calculate("5, 15, 25");

        Assertions.assertTrue(result.contains("합계: 45"));
        Assertions.assertTrue(result.contains("평균: 15"));
    }

    @Test
    void 계산결과확인() {
        String result = SimpleCalculator.calculate("10, 20, 30");

        Assertions.assertEquals("합계: 60, 평균: 20", result);
    }
}
