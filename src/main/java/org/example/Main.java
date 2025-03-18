package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long sum = Arrays.stream(sc.nextLine().split(" "))
                //스트림 사용시 이렇게 줄일 수도 있음
                .mapToLong(e -> Long.parseLong(e))
                .sum();

//        String[] inputBits = sc.nextLine().split(" "); //

        //        long sum = Arrays.stream(inputBits) // 스트림 사용함
//                .mapToLong(e -> Long.parseLong(e))
//                .sum();

//        long sum = 0; // 스트림 사용안함
//
//        for (String inputBit : inputBits) { // 스트림 사용안함
//            sum += Long.parseLong(inputBit);
//        }



        System.out.println(sum);

    }
}

