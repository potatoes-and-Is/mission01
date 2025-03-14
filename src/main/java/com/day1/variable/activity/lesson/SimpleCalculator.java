package com.day1.variable.activity.lesson;

public class SimpleCalculator {

    public static void main(String[] args) {
        // 공백 제거 => trim()
        // 쉼표(,)를 기준으로 문자 자르기 => split()
        // 정수형으로 변환 => Integer.parseInt()
        // "합계 : X, 평균 : Y" 형태로 반환

        String numTxt = "10, 20, 30";
        SimpleCalculator.calculate(numTxt);

    }

    public static String calculate(String numTxt) {
//       numTxt = numTxt.trim();
        numTxt = numTxt.replaceAll(" ", ""); // 공백 제거
//        System.out.println(numTxt);

        String[] numTxts = numTxt.split(","); // 개별 값들 출력

        int[] nums = new int[numTxts.length]; // int 배열 생성
        nums[0] = Integer.parseInt(numTxts[0]); // 값 대입
        nums[1] = Integer.parseInt(numTxts[1]);
        nums[2] = Integer.parseInt(numTxts[2]);

        int sum = nums[0] + nums[1] + nums[2]; // 합계 
        int avg = sum / nums.length; // 평균

        return "합계: " + sum + ", 평균: " + avg;
    }
}
