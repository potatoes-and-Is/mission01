package com.day1.variable.activity.lesson;

public class Mission2 {

    public static void main(String[] args) {
        // split(" ")으로 분할하여 단어 배열 생성
        // 배열의 인덱스를 변수에 직접 할당
        // 각 단어의 길이를 length) 메서드로 계산
        // 세 단어의 길이의 합계를 계산
        // 반복문 없이 변수, 데이터 타입, 연산자, 배열과 문자열 다루기만 사용
//        System.out.println("단어1:" + an.length() + ", 단어2:" + seong.length() + ", 단어3:" + jun.length() + ", 총 길이:" + sumLength);
        Mission2.getLength("An Seong Jun");
        Mission2.getSum("An Seong Jun");
    }


    public static int getLength(String word) {
        String[] name = word.split(" ");
        String an = name[0];
        String seong = name[1];
        String jun = name[2];

        return an.length() + seong.length() + jun.length();
    }

    public static String getSum(String word) {
        String[] name = word.split(" ");
        String an = name[0];
        String seong = name[1];
        String jun = name[2];
        int sumLength = an.length() + seong.length() + jun.length();
        return "단어1:" + an.length() + ", 단어2:" + seong.length() + ", 단어3:" + jun.length() + ", 총 길이:" + sumLength;
    }

}
