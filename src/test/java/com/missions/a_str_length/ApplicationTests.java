package com.missions.a_str_length;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTests {
    @Test
    void length() {
        String result = Application.countLength("Java is Fun");

        // 출력 기대값
        // "단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9"
        Assertions.assertEquals("단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9", result);
    }

}
