package com.day1.variable.chapter01;

public class Application01 {

    public static void main(String[] args) {

//        int 0x001 = 10; => 변수는 주소값을 가진다.
//        int 0x002 = 20;

        int number1 = 10;
        int number2 = 10;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        number1 = 30;
        number2 = 40;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        // 변수의 활용 2 => 변수는 같은 데이터를 여러 번 사용이 가능하다.
        int width = 10;
        int height = 20;

        int area = width * height;

        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("area = " + area);

        // Primitive(기본형)
        byte b1 = 10;        // 1 Byte (8 bits)
        short s1 = 10;       // 2 Bytes (16 bits)
        int i1 = 10;         // 4 Bytes (32 bits)
        long l1 = 10L;       // 8 Bytes (64 bits)
        float f1 = 10.0f;    // 4 Bytes (32 bits)
        double d1 = 10.0;    // 8 Bytes (64 bits)
        char c1 = 'a';       // 2 Bytes (16 bits) - UTF-16 (유니코드)
        boolean b2 = true;   // JVM에 따라 다르지만, 일반적으로 1 Byte (boolean의 크기는 명확히 정의되지 않음)

        String str1 = "Hello"; // => Reference(참조 자료형, 크기는 문자열의 길이와 JVM에 따라 다름)

    }
}
