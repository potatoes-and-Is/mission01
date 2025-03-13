package com.chapter1;

import day1.variable.activity.lesson.Mission2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Mission2Tests {

    @Test
    void 길이테스트(){
        String name = "An Seong Jun";
        int result = Mission2.getLength(name);
        Assertions.assertEquals(10, result);
    }

    @Test
    void 결과테스트(){
        String name = "An Seong Jun";
        String result = Mission2.getSum(name);
        Assertions.assertEquals("단어1:2, 단어2:5, 단어3:3, 총 길이:10", result);
    }
}
