package com.day1.variable.chapter04;

import java.util.Arrays;

public class ArrayDeep {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        System.out.println("복사된 배열 = " + arrCopy);
        System.out.println("기존 배열 = " + arr);
        arrCopy[0] = 100;
        System.out.println("arrCopy[0] = " + arrCopy[0]);
        System.out.println("arr[0] = " + arr[0]);

        int[] shallowCopy = arr;
        System.out.println("arr = " + arr);
        System.out.println("shallowCopy = " + shallowCopy);
        
        shallowCopy[0] = 1000;
        System.out.println("기존 배열 = " + arr[0]);
        System.out.println("복사된 배열 = " + shallowCopy[0]);
        
        
        ;
    }

}
