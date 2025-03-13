package com.missions.dayofweekprinter;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        int[] number = {1, 3, 5, 8};
        String result = application.dayOfWeekPrinter(number);
        System.out.println(result);
    }

    public String dayOfWeekPrinter(int[] number) {
        int len = number.length;
        String[] week = new String[len];
        for (int i = 0; i < len; i++) {
            switch(number[i]) {
                case 1:
                    week[i] = "Monday";
                    break;
                case 2:
                    week[i] = "Tuesday";
                    break;
                case 3:
                    week[i] = "Wednesday";
                    break;
                case 4:
                    week[i] = "Thursday";
                    break;
                case 5:
                    week[i] = "Friday";
                    break;
                case 6:
                    week[i] = "Saturday";
                    break;
                case 7:
                    week[i] = "Sunday";
                    break;
                default:
                    week[i] = "Unknown";
                    break;
            }
        }

        String result = String.join(", ", week);
//        String result = "";
//        for (int i = 0; i < len; i++) {
//            if (i == len - 1) {
//                result += week[i];
//            } else {
//                result += week[i] + ", ";
//            }
//
//        }
        return result;
    }
}
