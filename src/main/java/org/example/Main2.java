package org.example;
/*  */

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class Main2 {
    public static void main(String[] args) {

        int[] arr = new int[7]; //동적 할당
        /* arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50; */

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 10;
        }

        System.out.println(arr.length);


        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;

        System.out.printf("총합 : %d\n", sum);
        System.out.println("평균 : " + avg);


    }
}