package org.example;

/* 1. arr1 변수에 [true, false, true] 연결
 * 2. arr2 변수에 [3.14, 7.77, 11.11] 연결
 * 3. arr3 변수에 [1~10] 연결
 * - 객체 안에 데이터 넣기
 * - 해당 객체가 가지고 있는 데이터 전부 출력
 * - 3번은 반복문 사용
 * - 자바 기본타입
 * - 힌트는 Main2
 * - 구글링, AI X  */


import java.util.Arrays;

class Main3 {
    public static void main(String[] args) {

        // 1.
        boolean arr1[] = new boolean[]{true, false, true};

        System.out.println(arr1.length);
        System.out.println(Arrays.toString(arr1));
        //엥근데이거배웟든가;

        // 2.
        double arr2[] = new double[]{3.14, 7.77, 11.11};

        System.out.println(Arrays.toString(arr2));

        // 3. arr3 변수에 [1~10] 연결
        // 반복문 사용

        int arr3[] = new int[10];

        for (int i = 0; i < arr3.length; i++) { //i에 0을 넣었고, i가 arr3의 길이보다 커지면
            //0의 +1이 끝남
            //arr3의 용량을 내가 10이라고 넣어놓았고?
            // 
            arr3[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr3));

        //망했다 왜 된건지 이해가 안된다;
        //Arrays.toString은 분명 객체를 문자형으로 출력시키는 거겠지??




    }
}