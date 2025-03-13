package com.day2.activity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Mission2Test {

    @Test
    void 날짜구하기() {
        Mission2 mission2 = new Mission2();
        Assertions.assertEquals("Monday, Wednesday, Friday, Unknown", mission2.getResult(mission2.input));
    }
}