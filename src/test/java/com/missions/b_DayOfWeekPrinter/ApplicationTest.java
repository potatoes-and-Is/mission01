package com.missions.b_DayOfWeekPrinter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void DayOfWeekPrinter() {
        Application application = new Application();
        int[] input = {1, 3, 5, 8};
        String value = application.numberArray(input);
        String result = "Monday, Wednesday, Friday, Unknown";

        Assertions.assertEquals(result, value);
    }

}