package com.fastcampus.de.java.clip7_dataType;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intEmptyArray = new int[5]; //5개의 array
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[]{1,2,3,4,5}; // [1,2,3,4,5]로 초기화한 array
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] months = {"1월","2월","3월"};
        System.out.println(Arrays.toString(months));
        months[0]="10월";
        System.out.println(Arrays.toString(months));
        System.out.println(months.length);

        //2차원배열은?
        int[][] arr2d = new int[4][3];
    }
}
