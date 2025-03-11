package org.example;

import java.awt.*;
import java.util.Arrays;

class Main3 {
    public static void main(String[] args) {
        String msg = greet("Jin");
        System.out.println(msg);
        //greet에 잇는 걸 이름 Jin을 넣어 출력

        Point point = createPoint(5, 10);
        System.out.println("Point create at (" + point.x + ", " + point.y + ")");
        //x와 y에 각각 5와 10을 입력
        //그렇게 해서 5, 10

        int[] evens = firstNEvenNumbers(5);
        System.out.println("first 5 even numbers : " + Arrays.toString(evens));
        //i가 n보다 작을 시 i는 1씩 커지고 num에는 2를 더한다.
        // 그래서
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y);
    }

    public static int[] firstNEvenNumbers(int n) {
        int[] evenNumbers = new int[n];

        for (int i = 0, num = 2; i < n; i++, num += 2) {
            evenNumbers[i] = num;
        }
        return evenNumbers;
    }
}