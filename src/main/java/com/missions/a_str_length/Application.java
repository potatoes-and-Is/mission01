package com.missions.a_str_length;

public class Application {

    public static void main(String[] args) {
        String threeString = "Java is Fun";
        String result = countLength(threeString);
        System.out.println(result);
    }

    public static String countLength(String threeStr) {
        //입력 문자열을 split(" ")으로 분할하여 단어 배열을 생성한다.
        String[] threeStrs = threeStr.split(" ");
//        System.out.println(threeStrs[0]);

        //배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String firstStr = threeStrs[0];
        String secondStr = threeStrs[1];
        String thirdStr = threeStrs[2];

        //각 단어의 길이를 length() 메서드로 계산한다.
        int firstLength = firstStr.length();
        int secondLength = secondStr.length();
        int thirdLength = thirdStr.length();

        //세 단어의 길이의 합계를 계산한다.
        int sumStr = firstLength + secondLength + thirdLength;

        return "단어1: "+firstLength+", 단어2: "+secondLength+", 단어3: "+thirdLength+", 총 길이: "+sumStr;
    }

}
