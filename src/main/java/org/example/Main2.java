package org.example;

class Main2 {
    public static void main(String[] args) {
        int x = 10; //오직 정수만 넣을 수 있는 x라는 변수에 10이라는 값을 넣겠다.

        int[] arr = new int[4];
        //정수들(int[]) 모양으로 만들어진 객체의 리모컨만 들어갈 수 있는 arr라는 변수를 만들자마자,
        //arr라는 변수에 int[4](설계도)로 만든 객체의 **리모컨**을 넣겠다.

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