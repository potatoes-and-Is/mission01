package com.missions.a_str_length;

public class Application {
    public static void main(String[] args) {
        String str = "Java is Fun";
        String result = Application.countLength(str);
        System.out.println(result);
    }

    public static String countLength(String str) {
        // 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        String[] strs = str.split(" ");

        // 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        // 각 단어의 길이를 `length()` 메서드로 계산한다.
        int len = strs[0].length();
        int len2 = strs[1].length();
        int len3 = strs[2].length();

        // 세 단어의 길이의 합계를 계산한다.
        int sum = len + len2 + len3;

        return "단어1: " + len + ", 단어2: " + len2 + ", 단어3: " + len3 + ", 총 길이: " + sum;
    }
}
