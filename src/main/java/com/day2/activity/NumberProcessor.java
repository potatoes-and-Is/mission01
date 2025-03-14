package com.day2.activity;

public class NumberProcessor {

    String strNum = "10, 20, 30, 40";

    public static void main(String[] args) {
        NumberProcessor np = new NumberProcessor();
        String result = np.getResult(np.strNum);
        System.out.println(result);
    }

    /**
     * @Param input 쉼표로 구분된 숫자 문자열
     * @Return "합꼐 x, 평균 y, 짝수 개수, 홀 수 개수
     **/
    public String getResult(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "입력 없음";
        }
        String notNullNum = input.replaceAll(" ", "");
        String[] nums = notNullNum.split(",");

        int sum = 0; // 합계
        int oddCount = 0;  // 홀수
        int evenCount = 0; // 짝수

        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            sum += num;
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        double avg = (double) sum / nums.length;
        return "합계: " + sum + ", 평균: " + avg + ", 짝수 개수: " + evenCount + ", 홀수 개수: " + oddCount;
    }
}
