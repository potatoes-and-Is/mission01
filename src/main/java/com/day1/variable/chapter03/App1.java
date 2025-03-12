package com.day1.variable.chapter03;

// 연산자
public class App1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("덧셈: " + (a + b));
        System.out.println("나눗셈: " + (a / b));  // 정수 나눗셈 (소수점 이하 버려짐)
        System.out.println("나머지: " + (a % b));

        boolean isGreater = a > b;
        System.out.println("a가 b보다 큰가? " + isGreater);

        /*
         *  논리 연산자
         */
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("둘 다 참인가? : " + (isTrue && isFalse));
        System.out.println("둘 중 하나가 거짓인가? : " + (isTrue || isFalse));
        System.out.println("NOT은 너가 거짓이라는 것을 부정 하겠어!! : "+!isFalse);

        /*증감 연산자*/
        int age = 20;
        System.out.println("세월이 지나면 ~~~ :  " + (++age));
        System.out.println("작년에는 말이야.. : " + (--age));
    }
}
