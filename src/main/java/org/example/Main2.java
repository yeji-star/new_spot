package org.example;

class Main2 {
    public static void main(String[] args) {
        int x = 10;

        int[] arr;
        //정수들(int[]) 모양으로 만들어진 객체의 리모컨만 들어갈 수 있는 arr라는 변수를 만든다.
        arr = new int[4]; //arr라는 변수에 int[4](설계도)로 만든 객체의 **리모컨**을 넣겠다.
        //변수보다 객체가 더 큼 ... . . 그렇기 때문에 사용공간을 따로 만들어지고
        //그걸 컨트롤하기 위한 원격 컨트롤러를 변수로 만들게 되는 거임.
        

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