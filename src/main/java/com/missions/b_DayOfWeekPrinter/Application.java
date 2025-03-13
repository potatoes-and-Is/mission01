package com.missions.b_DayOfWeekPrinter;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        int[] numbers = {1, 3, 5, 8};
        String result = app.numberToDay(numbers);
        System.out.println(result);
    }


    public String numberToDay(int[] nums) {

        String result = "";

        // for문을 사용하여 배열의 각 요소 순차적으로 처리하기
        for (int num : nums) {
            // switch 문을 사용하여 각 숫자에 해당하는 요일을 문자열로 변환하기
            switch (num) {
                case 1:
                    result += "Monday ";
                    break;
                case 2:
                    result += "Tuesday ";
                    break;
                case 3:
                    result += "Wednesday ";
                    break;
                case 4:
                    result += "Thursday ";
                    break;
                case 5:
                    result += "Friday ";
                    break;
                case 6:
                    result += "Saturday ";
                    break;
                case 7:
                    result += "Sunday ";
                    break;
                default:
                    result += "Unknown ";
            }
            // Monday Wednesday Friday Unknown
        }

        result = result.trim().replace(" ", ","); // Monday,Wednesday,Friday,Unknown
        String[] strList = result.split(","); // ["Monday", "Wednesday", "Friday", "Unknown"]
        result = String.join(", ", strList);
        return result;
    }

}