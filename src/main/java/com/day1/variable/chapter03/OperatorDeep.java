package com.day1.variable.chapter03;

public class OperatorDeep {
    public static void main(String[] args) {
        // 오버 플로우
        int maxInt = Integer.MAX_VALUE;
        System.out.println("maxInt = " + maxInt);
        System.out.println("maxInt = " + (maxInt + 1));
        System.out.println("maxInt = " + (++maxInt));


        //전위, 후위 연산자
        int a = 5;
        int b = 5;
        int result1 = a++ + 2;
        int result2 = ++b + 2;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
