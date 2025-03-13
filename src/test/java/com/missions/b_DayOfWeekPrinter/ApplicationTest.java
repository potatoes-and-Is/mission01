package com.missions.b_DayOfWeekPrinter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void checkNumberToDay() {
        Application app = new Application();
        int[] input = {1, 3, 5, 8};
        String value = app.numberToDay(input);
        String result = "Monday, Wednesday, Friday, Unknown";

        Assertions.assertEquals(result, value); // 수행 결과, 출력 기대값
    }
}
