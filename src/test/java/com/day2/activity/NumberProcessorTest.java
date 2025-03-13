package com.day2.activity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberProcessorTest {

    @Test
    void testProcessNumbersValidInput(){
        NumberProcessor processor = new NumberProcessor();
        String input = processor.strNum;
        String result = processor.getResult(input);
        Assertions.assertEquals("합계: 100, 평균: 25.0, 짝수 개수: 4, 홀수 개수: 0", result);
    }

    @Test
    void testProcessNumbersInputEmpty(){
        NumberProcessor processor = new NumberProcessor();
        String input = "                          ";
        String result = processor.getResult(input);
        Assertions.assertEquals("입력 없음", result);
    }
}