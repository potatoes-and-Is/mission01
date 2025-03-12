package com.chapter1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Application2Tests {

    /*
    Assertions.assertEquals
    JUnit 에서 제공하는 테스트 메서드로,
    두 값이 동일한지 확인하는 데 사용됩니다.
    assertEquals(expected, actual);
    expected 는 기대하는 값이고, actual 은 실제 값입니다.

    assertEquals(expected, actual, "오류 메시지");
    테스트 실패 시 지정된 메시지가 표시됩니다.

    객체 비교
    객체의 경우 equals() 메서드를 사용하여 비교합니다.
    배열 비교에는 assertArrayEquals()를 사용하는 것이 좋습니다.
     */
    @Test
    void 연산테스트() {
        int result = 3+2;
        Assertions.assertEquals(5, result);
    }

    /*
    Assertions.assertTrue 는 JUnit 에서 제공하는 테스트 메서드로,
    주어진 조건이 참(true)인지 확인합니다

    assertTrue(booleanCondition);
    booleanCondition은 테스트하려는 불리언 표현식입니다.
    assertTrue("오류 메시지", booleanCondition); // Junit4
    assertTrue(booleanCondition, "오류 메시지");

    assertTrue(booleanCondition, () -> "오류 메시지");
     */

    @Test
    public void 불린테스트() {
        boolean result = 10 > 7;
        Assertions.assertTrue(result, "10은 7보다 커야합니다.");
//        Assertions.assertFalse(result, "10은 7보다 커야합니다.");
    }
}
