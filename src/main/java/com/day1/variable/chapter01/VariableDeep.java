package com.day1.variable.chapter01;

public class VariableDeep {
    public static void main(String[] args) {
        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");

        // String Pool => 같은 공간에 저장
        System.out.println( text1 == text2 ); // true
        System.out.println( text1 == text3 ); // false
        System.out.println(text1.equals(text2)); //
    }
}
