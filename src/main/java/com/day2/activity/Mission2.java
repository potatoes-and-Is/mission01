package com.day2.activity;

public class Mission2 {
    int[] input = {1,3,5,8};

    public static void main(String[] args) {
        Mission2 mission2 = new Mission2();
        System.out.println(mission2.getResult(mission2.input));
    }

    String getResult(int[] input){
        String[] resultArr = new String[input.length];
        String result = "";
        for (int i = 0; i < input.length; i++) {
            resultArr[i] = switch (input[i]){
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Unknown";
            };
            if(i == input.length - 1){
                result += resultArr[i];
            } else{
                result += resultArr[i] + ", ";
            }
        }
        return result;
    }
}
