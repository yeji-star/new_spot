package org.example;
/*  */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int a = 10; // 점

        int[] arr = new int[6]; //1차원 배열 // 선
        // 왼쪽 상황은 예정, 객체의 모양이 일치.
        //위와 아래의 차이는 없다. 사용법의 차이만 있다.
        int[][] arr2 = new int[2][3]; //2차원 배열 // 면
        //2nd (d는 디멘션의 d) Array
        //int가 3개씩 2묶음
        //좌표로 써먹을 수 있음

        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;

        //다차원 배열 (nd array)


    }
}