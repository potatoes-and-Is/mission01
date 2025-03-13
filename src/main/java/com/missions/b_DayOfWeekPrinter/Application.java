package com.missions.b_DayOfWeekPrinter;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        int[] input = {1, 3, 5, 8};
        String value = application.numberArray(input);
        System.out.println(value);
    }

    public String numberArray(int[] input) {

        String[] weekResult = new String[input.length];

        // 1. for문을 사용하여 배열의 각 요소를 순차적으로 처리한다.
        for(int i=0; i<input.length; i++) {
            // 2. switch 문을 사용하여 각 숫자에 해당하는 요일을 문자열로 변환한다.
            switch(input[i]){
                case 1: weekResult[i] = "Monday";
                    break;
                case 2: weekResult[i] = "Tuesday";
                    break;
                case 3: weekResult[i] = "Wednesday";
                    break;
                case 4: weekResult[i] = "Thursday";
                    break;
                case 5: weekResult[i] = "Friday";
                    break;
                case 6: weekResult[i] = "Saturday";
                    break;
                case 7: weekResult[i] = "Sunday";
                    break;
                default: weekResult[i] = "Unknown";
            }
        }
        // 3. 변환된 요일 문자열들을 콤마(,)로 구분하여 최종 결과 문자열을 생성한다.
        String weekResultString = String.join(", ", weekResult);

        return weekResultString;
    }
}
