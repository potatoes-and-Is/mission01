package com.day1.variable.chapter01;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
        // Scanner 객체 생성 : 힙 메모리 저장, 참조 변수는 스택에 저장됨
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자의 이름을 입력해주세요 : ");
        String name = scanner.nextLine();

        System.out.println("사용자의 나이를 입력해주세요 : ");
        int age = scanner.nextInt();

        System.out.println("안녕하세요 " + age + "세의 " + name + "입니다.");
        scanner.close();

    }
}
