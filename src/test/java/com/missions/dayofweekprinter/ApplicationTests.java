package com.missions.dayofweekprinter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void dayOfWeekPrinter() {
        Application application = new Application();
        int[] input = {1, 3, 5, 8};

        String value = application.dayOfWeekPrinter(input);
        String result = "Monday, Wednesday, Friday, Unknown";

        Assertions.assertEquals(result, value);
    }
}