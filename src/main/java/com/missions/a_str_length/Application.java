package com.missions.a_str_length;

public class Application{
    public static void main(String[] args) {
        String text = "Java is Fun";
        String result = Application.total_length(text);
        System.out.println(result);
        String result2 = Application.word_length(text);
        System.out.println(result2);

    }
    public static String total_length(String text) {
//        1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        String[] text2 = text.split(" ");
//        2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String a = text2[0];
        String b = text2[1];
        String c = text2[2];
//        3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        int num1 = a.length();
        int num2 = b.length();
        int num3 = c.length();
//        4. 세 단어의 길이의 합계를 계산한다.
        int total = num1 + num2 + num3;
//        String test = "9";
        String total2 = Integer.toString(total);
        return total2;
    }

    public static String word_length(String javaIsFun) {
        String[] text2 = javaIsFun.split(" ");
        String a = text2[0];
        String b = text2[1];
        String c = text2[2];

        int num1 = a.length();
        int num2 = b.length();
        int num3 = c.length();
        int total = num1 + num2 + num3;

        String word1 = Integer.toString(num1);
        String word2 = Integer.toString(num2);
        String word3 = Integer.toString(num3);
        String word4 = Integer.toString(total);
        String result = "단어1: " + word1 + ", 단어2: " +word2 +", 단어3: " + word3 + ", 총 길이: " + word4;
//        - **출력:** "단어1: <길이1>, 단어2: <길이2>, 단어3: <길이3>, 총 길이: <합계>" 형태의 결과 문자열.
//                Assertions.assertEquals("단어1: 4, 단어2: 2, 단어3: 3", result);
        return result;
    }
}

/*
* <요구사항 명세화>
- **미션 2: 입력 문자의 단어별 길이와 총 길이 구하기**
    - **입력:** 공백으로 구분된 3개의 단어로 구성된 문자열 (예: "Java is Fun")
    - **처리:**
        1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        4. 세 단어의 길이의 합계를 계산한다.
    - **출력:** "단어1: <길이1>, 단어2: <길이2>, 단어3: <길이3>, 총 길이: <합계>" 형태의 결과 문자열.
    - **제약:** 반복문 없이, 변수, 데이터 타입, 연산자, 배열과 문자열 다루기 기술만 사용한다.*/
