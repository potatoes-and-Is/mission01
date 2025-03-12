package com.missions.a_str_length;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTests {
    @Test
    void total_length() {
        String result = com.missons.a_str_length.Application.total_length("Java is Fun");
        Assertions.assertEquals("9", result);
    }

    @Test
    void word_length() {
        String result = com.missons.a_str_length.Application.word_length("Java is Fun");
        Assertions.assertEquals("단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9", result);
    }
}
//<요구사항 명세화>
//- **미션 2: 입력 문자의 단어별 길이와 총 길이 구하기**
//    - **입력:** 공백으로 구분된 3개의 단어로 구성된 문자열 (예: "Java is Fun")
//    - **처리:**
//        1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
//        2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
//        3. 각 단어의 길이를 `length()` 메서드로 계산한다.
//        4. 세 단어의 길이의 합계를 계산한다.
//    - **출력:** "단어1: <길이1>, 단어2: <길이2>, 단어3: <길이3>, 총 길이: <합계>" 형태의 결과 문자열.
//    - **제약:** 반복문 없이, 변수, 데이터 타입, 연산자, 배열과 문자열 다루기 기술만 사용한다.